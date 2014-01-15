package sandesh.unixtools.lib;

public class Uniq {
    public String getUniqLines(String text) {
        String[] lines = text.split("\n");
        String uniqLines = "";
        int length = lines.length;
        for (int i = 0; i < length - 1; i++) {
            if (!(lines[i].equals(lines[i + 1])))
                uniqLines = uniqLines + lines[i] + "\n";
        }
       return (uniqLines +lines[length -1]);
    }
}