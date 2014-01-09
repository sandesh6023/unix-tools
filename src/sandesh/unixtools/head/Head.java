package sandesh.unixtools.head;

import sandesh.unixtools.fs.ReadFromFile;
import java.io.IOException;

public class Head {
    public void printLines(String text,int noOfLines) {
        String[] lines = text.split("\n");
        for (int i = 0; i < noOfLines; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Head h1 = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        try {
            int noOfLines = Integer.parseInt(args[1]);
            h1.printLines(text,noOfLines);
            System.exit(0);
        } catch (Exception e) {
        }
        int noOfLines = 10;
        h1.printLines(text,noOfLines);
    }
}
