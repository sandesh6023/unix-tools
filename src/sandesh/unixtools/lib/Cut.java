package sandesh.unixtools.lib;


public class Cut {
    public String getFieldData(String data, int field_no, String delimiter) {
        String[] lines;
        StringBuilder result = new StringBuilder("");
        lines = data.split("\n");
        field_no = field_no - 1;

        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(delimiter);
            if (field_no < words.length) {
                result.append(words[field_no]).append("\n");
            } else result.append("").append("\n");
        }
        return result.toString();
    }
}
