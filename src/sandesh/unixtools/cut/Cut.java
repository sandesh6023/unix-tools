package sandesh.unixtools.cut;

import sandesh.unixtools.fs.ReadFromFile;
import java.io.IOException;

class ExtractRows{
    public void printRequiredRows(String text,int field){
        String[] rows = text.split("\n");
        int noOfRows = rows.length;
        for (int i = 0; i <noOfRows ; i++) {
            System.out.println(rows[i].split(",")[field-1]);
        }
    }
}

public class Cut {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileContent = read.readFile(args[0]);
        int fields = Integer.parseInt(args[1]);
        ExtractRows r1 = new ExtractRows();
        r1.printRequiredRows(fileContent,fields);
    }
}
