package sandesh.unixtools.lib;

public class Head {
    public String getRequiredLines(String text, int noOfLines) {
        String[] lines = text.split("\n");
        String result = "";
        for (int i = 0; i < noOfLines; i++) {
            result = result + lines[i] + "\n";
        }
        return result;
    }
}