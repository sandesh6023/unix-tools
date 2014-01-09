package sandesh.unixtools.wc;

import java.io.*;
import java.util.Scanner;

class WC{
    public static void main(String[] args) throws IOException {
        ReadFromFile myFile = new ReadFromFile();
        Count count = new Count();

        String input = myFile.readFile(args[0]);

        int noOfLines = count.lineCount(input);
        int noOfCharacter = count.charCount(input);
        int noOfWords = count.wordCount(input);

        System.out.println(noOfLines +" "+noOfWords+" "+noOfCharacter+" "+ args[0]);
    }
}

class ReadFromFile {
    public String readFile(String fileName) throws IOException{
        String returnValue = "";
        File file = new File(fileName);;
        String line = "";
        try {
            Scanner fileContent = new Scanner(file);
            while (fileContent.hasNextLine()) {
                line = fileContent.nextLine();
                returnValue += line + "\n";
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return returnValue;
    }
}

class Count{
    public int lineCount(String text) {
        String[] lines = text.split("\n");
        return lines.length;
    }

    public int wordCount(String text) {
        String[] words = text.split("\\s");
        return words.length;
    }

    public int charCount(String text) {
        String[] characters = text.split("");
        return characters.length;
    }
}