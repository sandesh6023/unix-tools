package sandesh.unixtools.tail;

import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class Tail {
    public void printLinesFromEnd(String text, int RequiredNoOfLines) {
        String[] lines = text.split("\n");
        int noOfLinesInFile = lines.length;
        for (int i = noOfLinesInFile - RequiredNoOfLines; i < noOfLinesInFile; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Tail tail = new Tail();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int RequiredNoOfLines = Integer.parseInt(args[1].substring(1));
            tail.printLinesFromEnd(text, RequiredNoOfLines);
            return;
        }
        int RequiredNoOfLines = 10;
        tail.printLinesFromEnd(text, RequiredNoOfLines);
    }
}
