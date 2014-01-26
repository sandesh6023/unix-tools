package sandesh.unixtools.cli;

import sandesh.unixtools.fs.ReadFromFile;
import sandesh.unixtools.lib.Head;

import java.io.IOException;

public class HeadMain {
    public static void main(String[] args) throws IOException {
        Head head = new Head();
        ReadFromFile read = new ReadFromFile();
        String text = read.readFile(args[0]);

        if (args.length > 1) {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            System.out.println(head.getRequiredLines(text, noOfLines));
            return;
        }

        String EnvironmentPath = System.getenv("SH_PATH1");
        String pathToConfig = EnvironmentPath + "../config/config.txt";
        String configInfo = read.readFile(pathToConfig);

        if (configInfo.length() == 0)
            System.out.println(head.getRequiredLines(text, 10));
        else {
            String[] noOfLines = configInfo.split("=");
            try{
                int lines = Integer.parseInt(noOfLines[1].trim());
                System.out.println(head.getRequiredLines(text, lines));
            }catch(Exception e){
                System.out.println(head.getRequiredLines(text, 10));
            }
        }
    }
}
