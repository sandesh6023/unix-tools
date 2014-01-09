package sandesh.unixtools.fs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public String readFile(String fileName) throws IOException {
        String returnValue = "";
        File file = new File(fileName);
        String line = "";
        try {
            Scanner fileContent = new Scanner(file);
            while (fileContent.hasNextLine()) {
                line = fileContent.nextLine();
                returnValue += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return returnValue;
    }
}
