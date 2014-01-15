package sandesh.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadTest {
    @Test
    public void testHeadCommandReturnsSpecifiedNoOfLines() throws Exception {
        Head head = new Head();
        String text = "aa\nbb\ncc\ndd\nhh\noo";
        String expected = "aa\nbb\ncc\n";
        String actualLines;
        actualLines = head.getRequiredLines(text,3);
        assertEquals(expected,actualLines);
    }
    @Test
    public void testHeadReturns10Lines() throws Exception{
        Head head = new Head();
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\n";
        String expected = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\n";
        String actualLines;
        actualLines = head.getDefaultNoOfLines(text);
        assertEquals(expected,actualLines);
    }
}

