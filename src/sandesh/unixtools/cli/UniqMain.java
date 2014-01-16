package sandesh.unixtools.cli;

import sandesh.unixtools.lib.Uniq;
import sandesh.unixtools.fs.ReadFromFile;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileContent = read.readFile(args[0]);

        Uniq uniq = new Uniq();
        System.out.println(uniq.getUniqLines(fileContent));
    }
}
