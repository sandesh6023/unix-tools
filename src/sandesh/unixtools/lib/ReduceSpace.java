package sandesh.unixtools.lib;


public class ReduceSpace {
    public String trimSpace(String text) {
        return text.replaceAll("\\ +", " ");
    }
}
