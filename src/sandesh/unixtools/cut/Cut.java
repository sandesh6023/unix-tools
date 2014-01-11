package sandesh.unixtools.cut;

import sandesh.unixtools.fs.ReadFromFile;
import sun.reflect.annotation.ExceptionProxy;

import java.io.IOException;

class ExtractRows{
    public void printRequiredRows(String text, int field,String delimiter){
            String[] rows = text.split("\n");
            int noOfRows = rows.length;
            for (int i = 0; i <noOfRows ; i++) {
                System.out.println(rows[i].split(delimiter)[field-1]);
            }
    }
}

public class Cut {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileContent = read.readFile(args[0]);
        ExtractRows r1 = new ExtractRows();

        InputHandler input = new InputHandler();
        int field = Integer.parseInt(args[1]);
        try{
            String delimiter = args[2].substring(3,4);
            r1.printRequiredRows(fileContent,field,delimiter);
            System.exit(0);
        }catch (Exception e){
        }
        String delimiter = " ";
        r1.printRequiredRows(fileContent,field,delimiter);
    }
}
