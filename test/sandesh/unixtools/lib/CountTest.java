package sandesh.unixtools.lib;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class CountTest {
    @Test
    public void testLineCount() throws Exception {
        WC count = new WC();
        String text = "a\nb\nc\nf\ng\n";
        int actualResult = count.lineCount(text);
        int expected = 5;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testWordCount() throws Exception {
        WC count = new WC();
        String text = "a eee\nb yuu\nc\nf\ng\n";
        int actualResult = count.charCount(text);
        int expected = 18;
        assertEquals(expected,actualResult);
    }

    @Test
    public void testCharCount() throws Exception {
        WC count = new WC();
        String text = "a ljf\nb lfjl\nc\nf\ng\n";
        int actualResult = count.wordCount(text);
        int expected = 7;
        assertEquals(expected, actualResult);
    }
}