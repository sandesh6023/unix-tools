package sandesh.unixtools.head;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Head {
    public void printLines(String text,int noOfLines) {
        String[] lines = text.split("\n");
        for (int i = 0; i < noOfLines; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Head h1 = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        try {
            int noOfLines = Integer.parseInt(args[1]);
            h1.printLines(text,noOfLines);
            System.exit(0);
        } catch (Exception e) {
//            System.err.println("please enter correct argument");
        }
        int noOfLines = 10;
        h1.printLines(text,noOfLines);
    }
}

class ReadFromFile {
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