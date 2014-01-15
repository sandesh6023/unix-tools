package sandesh.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest{
    @Test
    public void testCutCount() throws Exception {
        String input = "abc ab\nefg ef\nlmn ln\nyou yu";
        String expected = "ab\nef\nln\nyu\n";
        Cut cut = new Cut();
        String actual = cut.cutCount(2,input," ");
        assertEquals(expected, actual);
    }
    @Test
    public void test_for_CutCount() throws Exception {
        String input = "abc ab\nefg ef\nlmn ln\nyou yu";
        String expected = "abc\nefg\nlmn\nyou\n";
        Cut cut = new Cut();
        String actual = cut.cutCount(1,input," ");
        assertEquals(expected, actual);
    }
}