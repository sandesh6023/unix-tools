package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.Head;

import java.io.IOException;

public class HeadMain {
    public static void main(String[] args) throws IOException {
        Head head = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            System.out.println(head.getRequiredLines(text, noOfLines));
            return;
        }
        System.out.println(head.getDefaultNoOfLines(text));
    }
}
