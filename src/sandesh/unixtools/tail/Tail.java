package sandesh.unixtools.tail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Tail {
    public void printLinesFromEnd(String text,int noOfLines) {
        String[] lines = text.split("\n");
        int noOfLinesInFile = lines.length;

        for (int i = noOfLinesInFile-noOfLines; i < noOfLinesInFile; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Tail t1 = new Tail();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        try {
            int noOfLines = Integer.parseInt(args[1]);
            t1.printLinesFromEnd(text,noOfLines);
            System.exit(0);
        } catch (Exception e) {
        }
        int noOfLines = 10;
        t1.printLinesFromEnd(text,noOfLines);
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
