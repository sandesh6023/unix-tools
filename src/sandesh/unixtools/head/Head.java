package sandesh.unixtools.head;

import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class Head {
    public void printLines(String text, int noOfLines) {
        String[] lines = text.split("\n");

        for (int i = 0; i < noOfLines; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Head head = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            head.printLines(text, noOfLines);
            return;
        }
        int noOfLines = 10;
        head.printLines(text, noOfLines);
    }
}