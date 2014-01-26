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

}