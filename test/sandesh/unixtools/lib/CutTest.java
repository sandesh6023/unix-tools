package sandesh.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest {
    @Test
    public void testGetFieldData() throws Exception {
        String input ="aaa,bbb\nccc,ddd";
        String expected = "aaa\nccc\n";
        Cut cut = new Cut();
        String result = cut.getFieldData(input,1,",");
        assertEquals(expected,result);
    }
    @Test
    public void testGetFieldDataWhwnFieldNoMore() throws Exception {
        String input ="aaa,bbb\nccc,ddd,eee";
        String expected = "\neee\n";
        Cut cut = new Cut();
        String result = cut.getFieldData(input,3,",");
        assertEquals(expected,result);
    }
}