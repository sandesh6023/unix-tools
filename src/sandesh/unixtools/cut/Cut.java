package sandesh.unixtools.cut;

import sandesh.unixtools.fs.ReadFromFile;
import java.io.IOException;

class ExtractRows {
    public void printRequiredRows(String text, int field, String delimiter) {
        String[] rows = text.split("\n");
        int noOfRows = rows.length;
        for (int i = 0; i < noOfRows; i++) {
            System.out.println(rows[i].split(delimiter)[field - 1]);
        }
    }
}

class MultipleRowsExtractor {
    public void printMultipleRows(String text, Integer[] fields, String delimiter) {
        String[] rows = text.split("\n");
        int noOfRows = rows.length;
        int fieldsLength = fields.length;
        String requiredRows = "";
        for (int i = 0; i < noOfRows; i++) {
            requiredRows = requiredRows + "\n";
            for (int j = 0; j < fieldsLength; j++) {
                requiredRows = requiredRows + rows[i].split(delimiter)[fields[j] - 1] + delimiter;
            }
        }
        System.out.println(requiredRows);
    }
}

public class Cut {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileContent = read.readFile(args[0]);
        ExtractRows r1 = new ExtractRows();

        if (args[1].length() > 1) {
            InputHandler Input = new InputHandler();
            MultipleRowsExtractor getRows = new MultipleRowsExtractor();
            Integer[] fields = Input.returnFields(args[1]);
            String delimiter = args[2].substring(3, 4);
            getRows.printMultipleRows(fileContent, fields, delimiter);
            return;
        }

        int field = Integer.parseInt(args[1]);
        if (args.length > 2) {
            String delimiter = args[2].substring(3, 4);
            r1.printRequiredRows(fileContent, field, delimiter);
            return;
        }

        String delimiter = " ";
        r1.printRequiredRows(fileContent, field, delimiter);
    }
}
