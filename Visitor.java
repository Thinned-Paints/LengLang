import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Visitor extends  lenglangrammarBaseVisitor<String> {

    public static StringBuilder treestring = new StringBuilder();
    //This will go through the whole AST until it has finished, firing off a case every time it gets a match.
    @Override
    public String visitScript(lenglangrammarParser.ScriptContext ctx) {
        List<ParseTree> kids = ctx.children;
        try{
            for (ParseTree pt : kids) {
                String claz = pt.getClass().getSimpleName();
                System.out.println(claz);
                switch (claz){
                    case "TerminalNodeImpl":
                        Transpiler.TerminalNodeImpl(pt);
                        break;
                    case "SeqentialstatementContext":
                        Transpiler.SequentialstatementContext(pt);
                        break;
                    case "ErrorNodeImpl":
                        Transpiler.CloseLoop();
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return treestring.toString();
    }

    //This does a depth first search on the parse tree
    public ParseTree dig(ParseTree tree) {
        for (int x = 0; tree.getChildCount() > x; x++) {

            dig(tree.getChild(x));


            if (istoken(tree.getChild(x))){

                treestring.append(tree.getChild(x));
            }

        }
        return tree;
    }

    //Looks for square brackets, if it finds them, it rejects it.
    public boolean istoken(ParseTree child){

        return !child.toString().contains("[");
    }

}
