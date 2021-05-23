import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileWriter;
import java.io.IOException;

//This is the (com/trans)piler, as it turns lenglang into python 3.
public class Transpiler {
    //Just chops off a bit of whitespace
    public static void CloseLoop(){
        if (whitespace>0) {
            whitespace--;
        }
    }

    static FileWriter pywriter;
    public static int whitespace = 0;
    public static void TerminalNodeImpl(ParseTree pt) throws IOException {
        String spt = pt.getText();
        String pyline = "";
        if(spt.startsWith("</")){
            pyline = "#START OF PROGRAM";
        }else{
            pyline = "#END OF PROGRAM";
        }
        String[] sptar = arrayize(pyline);
        ScriptWriter.appendLine(sptar,whitespace);
    }
    public static void SequentialstatementContext(ParseTree pt) throws IOException {
        int kids = pt.getChildCount();
        for (int i =0; i<kids;i++){
            ParseTree cpt =  pt.getChild(i);
            String cptvalue = cpt.getText();

            switch (cptvalue){
                case "#":
                    break;

                case ";\n":
                    break;
            }
            if(cptvalue.contains("LOGIC(")){
                System.out.println("Logic spotted");
                logic(cpt);
                break;
            }else if(cptvalue.contains("PRINT")) {
                printer(cpt);
                break;
            }else if(cptvalue.contains("=INT(")||cptvalue.contains("=CHAR(")||cptvalue.contains("=STRING(")||cptvalue.contains("=DECIMAL(")){
                assignment(cpt);
                break;
            }

        }
    }
    //This defines variables, very generic, required for turing complete, why am I telling you this? You probably taught me this
    public static boolean assignment(ParseTree pt){
        try {
            String valuechild = pt.getText();
            String varx = valuechild.substring(0, valuechild.indexOf("="));
            String payload = valuechild.substring((valuechild.indexOf("(")+1), (valuechild.indexOf(")")));
            StringBuilder assingmentpy = new StringBuilder(varx);
            assingmentpy.append(" ");
            assingmentpy.append("= " + payload);
            String[] finline = arrayize(assingmentpy.toString());
            ScriptWriter.appendLine(finline,whitespace);
            return true;
        }catch ( Exception e){
            e.printStackTrace();
            return false;
        }
    }
    //This handles print statements, which despite being simple, do use some literals so need special care
    public static boolean printer(ParseTree pt){
        try {
            String valuechild = pt.getText();
            String sansprint = valuechild.substring(6,(valuechild.length()-1));

            String printline = "print("+sansprint+")";
            String[] formatted = arrayize(printline);
            ScriptWriter.appendLine(formatted,whitespace);
            return true;
        }catch ( IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean logic(ParseTree pt){
        try{
            String ptc = pt.getText();
            System.out.println(ptc);
            //This is called insane because it has no "LOGIC", I'm so incredibly funny
            String insane = ptc.substring(6);
            String whileorif = insane.substring(0, (insane.indexOf("(")));
            StringBuilder conditionalline = new StringBuilder(whileorif.toLowerCase());
            String firstcond = insane.substring((insane.indexOf("(")+1),insane.indexOf(")"));
            conditionalline.append("("+firstcond+")");
            int cutlen = 2+whileorif.length()+6+firstcond.length();
            String operatoronwards = ptc.substring(cutlen);
            String operator = operatoronwards.substring(0,operatoronwards.indexOf("("));
            switch (operator) {
                case "%m":
                    operator = "%";
                    break;
                case "==":
                    break;
                case "==!":
                    operator = "!=";
                    break;
                case "==NOT":
                    operator = "!=";
                    break;
                case "OR":
                    operator = "or";
                    break;
                case "|":
                    operator = "|";
                    break;
                case "XOR":
                    operator = "^";
                    break;
                case "*|":
                    operator = "^";
                    break;
                case "AND":
                    operator = "and";
                    break;
                case "&":
                    operator = "and";
                    break;
                case "ANDNOT":
                    operator = "and not";
                    break;
                case "&NOT":
                    operator = "and not";
                    break;
                case "AND!":
                    operator = "and not";
                    break;
                case "&!":
                    operator = "and not";
                    break;
                case "<":
                    //Leaving a case for posterity, although it is unnecesary
                    break;
                case ">":
                    break;
            }

            conditionalline.append(operator);
            operatoronwards = operatoronwards.substring(operatoronwards.indexOf("("));
            System.out.println(operatoronwards);
            String secondstatement = operatoronwards.substring(0,operatoronwards.indexOf(")"));
            conditionalline.append(secondstatement+"):");
            String finlin = conditionalline.toString();
            String[] finlinar = arrayize(finlin);
            ScriptWriter.appendLine(finlinar, whitespace);
            whitespace++;
            return true;
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }
    //Just generates an array from a string, saves me writing the code out a million times
    public static String[] arrayize(String line){
        String[] ar = new String[1];
        ar[0] = line;
        return ar;
    }
}