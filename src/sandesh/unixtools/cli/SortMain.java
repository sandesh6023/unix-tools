package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.Sort;

import java.io.IOException;

public class SortMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String filename = args[0];
        String sortedData[],reverse[];
        String input = read.readFile(filename);
        Sort s = new Sort();
        if(args.length == 2 && (args[1].compareTo("-r") == 0)){
            reverse = s.reverseSort(input);
            for (int i = 0; i <reverse.length ; i++) {
                System.out.println(reverse[i]);
            }
        }else{
            sortedData = s.defaultSort(input);
            for (int i = 0; i <sortedData.length ; i++) {
                System.out.println(sortedData[i]);
            }
        }
    }
}