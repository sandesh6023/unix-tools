package sandesh.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReduceSpaceTest {
    @Test
    public void testTrimSpace() throws Exception {
        ReduceSpace trim = new ReduceSpace();
        String text = "abc     efg      lmn  qwe    u";
        String expectedText = "abc efg lmn qwe u";
        String actualText = trim.trimSpace(text);
        assertEquals(expectedText, actualText);
    }
}
