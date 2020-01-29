package blavatskyi.roman;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SecondTaskTest {

    @Test
    public void getAmountSquaresOfEvenNumbers() {
        List<Integer> integers = Arrays.asList(2, 3, 4, 6, 12, 9, 16);
        assertEquals(2, SecondTask.getAmountSquaresOfEvenNumbers(integers));
    }

    @Test
    public void findDigitalRootOfNumber() {
        assertEquals(3, SecondTask.findDigitalRootOfNumber(12));
    }
}