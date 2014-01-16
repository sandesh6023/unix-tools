package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.WC;

import java.io.IOException;

public class WcMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile myFile = new ReadFromFile();
        WC count = new WC();

        String input = myFile.readFile(args[0]);

        int noOfLines = count.lineCount(input);
        int noOfCharacter = count.charCount(input);
        int noOfWords = count.wordCount(input);

        System.out.println(noOfLines + " " + noOfWords + " " + noOfCharacter + " " + args[0]);

    }
}
