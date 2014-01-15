package sandesh.unixtools.lib;

public class Tail {
    public String getDefaultNoOfLines(String text) {
        int noOfLines = 10;
        return getRequiredLinesFromEnd(text, noOfLines);
    }

    public String getRequiredLinesFromEnd(String text, int RequiredNoOfLines) {
        String[] lines = text.split("\n");
        int noOfLinesInFile = lines.length;
        String result = "";
        for (int i = noOfLinesInFile - RequiredNoOfLines; i < noOfLinesInFile; i++) {
            result = result + lines[i] + "\n";
        }
        return result;
    }
}
