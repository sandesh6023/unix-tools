package sandesh.unixtools.lib;


public class Cut {
    public String cutCount(int field_no,String input,String delimiter){
        String words[];
        String result = "";
        String lines[] = input.split("\n");
        for(int i = 0;i < lines.length;i++ ){
            words = lines[i].split(delimiter);
            if(words.length >= field_no)
                result = result + words[field_no-1] + "\n";
        }
        return result;
    }

}