package sandesh.unixtools.sort;

import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

class SortFile {
    public String[] splitByNewLine(String text) {
        return text.split("\n");
    }

    public String[] doGenericSort(String text) {
        String[] splitContent = splitByNewLine(text);
        Arrays.sort(splitContent);
        return splitContent;
    }

    public void printOutput(String[] arrayOfStrings) {
        String listString = "";
        for (String s : arrayOfStrings) {
            listString += s + "\n";
        }
        System.out.println(listString);
    }
}

public class Sort {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);
        SortFile sort = new SortFile();

        if (args.length == 1) {
            String[] sortedArray = sort.doGenericSort(text);
            Arrays.asList(sortedArray);
            sort.printOutput(sortedArray);
            return;
        }
        if (args[1].equals("-r")) {
            String[] sortedString = sort.doGenericSort(text);
            Collections.reverse(Arrays.asList(sortedString));
            sort.printOutput(sortedString);
        }
    }
}