package sandesh.unixtools.cli;

import sandesh.unixtools.lib.ReduceSpace;
import sandesh.unixtools.fs.ReadFromFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReduceMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileText = read.readFile(args[0]);
        ReduceSpace trim = new ReduceSpace();
        String content = trim.trimSpace(fileText);
        try{
            File file = new File(args[0]);
            FileWriter fw = new FileWriter(args[0]);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
