package sandesh.unixtools.head;

import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class Head {
    public String getDefaultNoOfLines(String text){
        int noOfLines = 10;
        return getRequiredLines(text,noOfLines);
    }

    public String getRequiredLines(String text, int noOfLines) {
        String[] lines = text.split("\n");
        String result = "";
        for (int i = 0; i < noOfLines; i++) {
            result = result + lines[i]  + "\n";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Head head = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            head.getRequiredLines(text, noOfLines);
            return;
        }
        int noOfLines = 10;
        head.getRequiredLines(text, noOfLines);
    }
}