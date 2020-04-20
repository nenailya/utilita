package grep;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.awt.*;
import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UtilitaLauncher {

    @Option(name = "-r", required = true,
            usage = "Displays constructions containing the given expression.")
    boolean regex;


    @Option(name = "-v", required = true,
            usage = "Inverts condition")
    boolean invert;

    @Option(name = "-i", required = true,
            usage = "Ignores register.")
    boolean ignore;

    @Argument(required = true, metaVar = "word", index = 0,
            usage = "W")
    String word;

    @Argument(required = true, metaVar = "inputname", index = 1,
            usage = "W")
    String inputname;


    public static void main(String[] args) {
        new UtilitaLauncher().launch(args);
    }

    private void launch(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("java -jar grep.jar grep -v -i -r Regex word inputname");
            parser.printUsage(System.err);
            return;
        }

        Utilita grep = new Utilita(regex, invert, ignore);
        ArrayList res = (ArrayList) grep.grep(word, inputname);
        System.out.println(res);

    }
}
