package sandesh.unixtools.lib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public String[] defaultSort(String input) {
        String content[] = input.split("\n");
        Arrays.sort(content);
        return content;
    }
    public String[] reverseSort(String input){
        String lines[] = defaultSort(input);
        List<String> list = Arrays.asList(lines);
        Collections.reverse(list);
        lines = list.toArray(new String[list.size()]);
        return lines;
    }
}