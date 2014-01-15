package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.Cut;

import java.io.IOException;

public class CutMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String delimiter = " ", input = "";
        int field = 0;
        Cut cut = new Cut();
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-d")) delimiter = args[i].substring(2);
            if (args[i].startsWith("-f")) field = Integer.parseInt(args[i].substring(2));
            if (args[i].endsWith(".txt")) input = read.readFile(args[i]);
        }
        System.out.println(cut.cutCount(field, input, delimiter));
    }
}