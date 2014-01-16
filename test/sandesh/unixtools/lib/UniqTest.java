package sandesh.unixtools.lib;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class UniqTest {
    @Test
    public void testGetUniqLines() throws Exception {
        Uniq uniq = new Uniq();
        String text = "a\na\nb\nf\nf\nt\nt\nq";
        String expected = "a\nb\nf\nt\nq";
        String actualText = uniq.getUniqLines(text);
        assertEquals(expected,actualText);
    }
    @Test
    public void testGetUniqLinesWhenLastTwoLinesAreEqual() throws Exception {
        Uniq uniq = new Uniq();
        String text = "a\na\nb\nf\nf\nt\nt\nq\nq";
        String expected = "a\nb\nf\nt\nq";
        String actualText = uniq.getUniqLines(text);
        assertEquals(expected,actualText);
    }
    @Test
    public void testGetUniqLinesWhenLastTwoLinesAreEqualAndNextLineIsSlashN() throws Exception {
        Uniq uniq = new Uniq();
        String text = "a\na\nb\nf\nf\nt\nt\nq\nq\n";
        String expected = "a\nb\nf\nt\nq";
        String actualText = uniq.getUniqLines(text);
        assertEquals(expected,actualText);
    }
}
