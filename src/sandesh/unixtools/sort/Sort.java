package sandesh.unixtools.sort;

import org.apache.commons.lang.ArrayUtils;
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
}

public class Sort {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);
        SortFile sort = new SortFile();

//        if (args.length == 1) {
//            String[] sortedArray = sort.doGenericSort(text);
//            for (int i = 0; i < sortedArray.length; i++) {
//                System.out.println(sortedArray[i]);
//            }
//            return;
//        }
        if (args.length == 2) {
            String[] sortedString = sort.doGenericSort(text);
            Collections.reverse(Arrays.asList(sortedString));
            String listString = "";
            for (String s : sortedString)
            {
                listString += s + "\n";
            }

            System.out.println(listString);
//            System.out.println(Arrays.toString(sortedString));
        }
    }
}
