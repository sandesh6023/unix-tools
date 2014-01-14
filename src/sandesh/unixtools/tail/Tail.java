package sandesh.unixtools.tail;

import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class Tail {
    public String getDefaultNoOfLines(String text){
        int noOfLines = 10;
        return getRequiredLinesFromEnd(text,noOfLines);
    }

    public String getRequiredLinesFromEnd(String text, int RequiredNoOfLines) {
        String[] lines = text.split("\n");
        int noOfLinesInFile = lines.length;
        String result = "";
        for (int i = noOfLinesInFile - RequiredNoOfLines; i < noOfLinesInFile; i++) {
            result = result + lines[i]  + "\n";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Tail tail = new Tail();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int RequiredNoOfLines = Integer.parseInt(args[1].substring(1));
            tail.getRequiredLinesFromEnd(text, RequiredNoOfLines);
            return;
        }
        int RequiredNoOfLines = 10;
        tail.getRequiredLinesFromEnd(text, RequiredNoOfLines);
    }
}
