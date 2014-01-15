package sandesh.unixtools.lib;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TailTest {
    @Test
    public void testGetDefaultNoOfLines() throws Exception {
        Tail tail = new Tail();
        String text = "aa\nbb\ncc\ndd\nhh\noo";
        String expected = "hh\noo\n";
        String actualLines;
        actualLines = tail.getRequiredLinesFromEnd(text,2);
        assertEquals(expected,actualLines);
    }

    @Test
    public void testGetRequiredLinesFromEnd() throws Exception {
        Tail tail = new Tail();
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\n";
        String expected = "f\ng\nh\ni\nj\nk\nl\nm\nn\no\n";
        String actualLines;
        actualLines = tail.getDefaultNoOfLines(text);
        assertEquals(expected,actualLines);
    }
}
