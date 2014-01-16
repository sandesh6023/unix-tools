package sandesh.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SortTest extends Sort {
    @Test
    public void testDefaultSort() throws Exception {
        String input = "sa\nka\nma\nshi\ntan\nsay";
        String expected[] = {"ka","ma","sa","say","shi","tan"};
        Sort sort = new Sort();
        String actual[] = sort.defaultSort(input);
        for (int i = 0; i < actual.length ; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testReverseSort() throws Exception {
        String input = "sa\nka\nma\nshi\ntan\nsay";
        String expected[] = {"tan","shi","say","sa","ma","ka"};
        Sort sort = new Sort();
        String actual[] = sort.reverseSort(input);
        for (int i = 0; i < actual.length ; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
