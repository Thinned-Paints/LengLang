import javax.management.AttributeList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScriptWriter {
    //I'm partial to Guy Ritchie myself

    //This just vomits the entire script into a file after the AST has been fully parsed and broken down
    public static List<String> thewholescript;

    public static void initScript(){
        thewholescript = new ArrayList<>();
    }

    public static void appendLine(String[] lines, int whitespace){
        StringBuilder tabs = new StringBuilder();
        if (whitespace<0){

        }
        if (whitespace>0){
            for (int x = 0; whitespace > x; x++) {
                tabs.append("        ");
            }

            for (int x = 0; lines.length > x; x++) {
                lines[x] = tabs.toString()+lines[x];
            }
        }

        if(thewholescript==null){
            initScript();
        }
        thewholescript.addAll(Arrays.asList(lines));
    }

    public static boolean writeToFile() throws IOException {
        File pyscript = new File("PyScript.txt");
        FileWriter pywriter = new FileWriter(pyscript);

        System.out.println("File generated");
        for (String s : thewholescript) {
            System.out.println(s);
            pywriter.write(s+"\n");
            pywriter.flush();
        }
        pywriter.close();
        return true;
    }
}
