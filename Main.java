import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    final static String script = "";

    public static void main(String[] args) throws IOException {
        intro();
        Scanner inp = new Scanner(System.in);
        File imp = new File("testscript.txt");
        Scanner reader = new Scanner(imp);
        StringBuilder data = new StringBuilder();
        while(reader.hasNextLine()){
            data.append(reader.nextLine());
        }

        String dstring = data.toString();
        CharStream chars = CharStreams.fromString(dstring);
        lenglangrammarLexer lexer = new lenglangrammarLexer(chars);
        CommonTokenStream tokenstream = new CommonTokenStream(lexer);
        lenglangrammarParser parser = new lenglangrammarParser(tokenstream);

        new Visitor().visitScript(parser.script());
        ScriptWriter.writeToFile();

    }

    public static void intro(){
        System.out.println("\n" +
                "██      ███████ ███    ██  ██████  ██       █████  ███    ██  ██████  \n" +
                "██      ██      ████   ██ ██       ██      ██   ██ ████   ██ ██       \n" +
                "██      █████   ██ ██  ██ ██   ███ ██      ███████ ██ ██  ██ ██   ███ \n" +
                "██      ██      ██  ██ ██ ██    ██ ██      ██   ██ ██  ██ ██ ██    ██ \n" +
                "███████ ███████ ██   ████  ██████  ███████ ██   ██ ██   ████  ██████  \n" +
                "                                                                      \n" +
                "hl17490                                                               \n");
    }

}
