package sandesh.unixtools.lib;

public class WC {
    public int lineCount(String text) {
        String[] lines = text.split("\n");
        return lines.length;
    }

    public int wordCount(String text) {
        String[] words = text.split("\\W");
        return words.length;
    }

    public int charCount(String text) {
        return text.length();
    }
}