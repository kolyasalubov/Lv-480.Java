package borys.latyk;

import latyk.borys.Algorythm;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlgorythmTest {
    @Test
    public void getSwapDigits() throws IOException {
        assertEquals(38457, Algorythm.swapDigits("78453"));
        assertEquals(00, Algorythm.swapDigits("00"));
        assertEquals(55555, Algorythm.swapDigits("55555"));

    }

    @Test
    public void getAddDigits() throws IOException {
        assertEquals(1001, Algorythm.addDigits("00"));
        assertEquals(1111, Algorythm.addDigits("11"));
        assertEquals(1876541, Algorythm.addDigits("87654"));

    }

    @Test
    public void getcheckTheorem() throws IOException {
        List<Integer> testList = Arrays.asList(45, 6, 3, 0, 0);
        List<Integer> methodList = Algorythm.checkTheorem("45");
        assertTrue(testList.equals(methodList));

    }
}
