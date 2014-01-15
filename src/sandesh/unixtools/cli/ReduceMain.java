package sandesh.unixtools.cli;

import sandesh.unixtools.lib.ReduceSpace;
import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class ReduceMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileText = read.readFile(args[0]);
        ReduceSpace trim = new ReduceSpace();
        System.out.println(trim.trimSpace(fileText));
    }
}
