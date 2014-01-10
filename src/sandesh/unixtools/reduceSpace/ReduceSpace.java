package sandesh.unixtools.reduceSpace;

import org.apache.commons.lang.StringUtils;
import sandesh.unixtools.fs.ReadFromFile;
import java.io.IOException;

public class ReduceSpace {
    public void trimSpace(String text){
        String formtattedText;
        formtattedText = text.replaceAll("\\ +"," ");
        System.out.println(formtattedText);
    }

    public static void main(String[] args) throws IOException {
        ReadFromFile read = new ReadFromFile();
        String fileText = read.readFile(args[0]);
        ReduceSpace trim = new ReduceSpace();
        trim.trimSpace(fileText);
    }
}