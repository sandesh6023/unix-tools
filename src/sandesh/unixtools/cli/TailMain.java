package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.Tail;

import java.io.IOException;


public class TailMain {
    public static void main(String[] args) throws IOException {
        Tail tail = new Tail();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int RequiredNoOfLines = Integer.parseInt(args[1].substring(1));
            System.out.println(tail.getRequiredLinesFromEnd(text, RequiredNoOfLines));
            return;
        }

        String EnvironmentPath = System.getenv("SH_PATH1");
        String pathToConfig = EnvironmentPath + "../config/config.txt";
        String configInfo = read.readFile(pathToConfig);

        if (configInfo.length() == 0)
            System.out.println(tail.getRequiredLinesFromEnd(text, 10));
        else {
            String[] noOfLines = configInfo.split("=");
            try{
                int lines = Integer.parseInt(noOfLines[1].trim());
                System.out.println(tail.getRequiredLinesFromEnd(text, lines));
            }catch(Exception e){
                System.out.println(tail.getRequiredLinesFromEnd(text, 10));
            }
        }
    }
}
