package huliaka.maksym;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculation = new Calculator();

    @Test
    public void getDigitQuantity() {
        assertEquals(10, calculation.getDigitQuantity(1111111111));
        assertEquals(4, calculation.getDigitQuantity(-9999));
        assertEquals(2, calculation.getDigitQuantity(-99));
        assertEquals(1, calculation.getDigitQuantity(0));
    }

    @Test
    public void getDigitSum() {
        assertEquals(1, calculation.getDigitSum(100));
        assertEquals(18, calculation.getDigitSum(-99));
        assertEquals(5, calculation.getDigitSum(-5));
        assertEquals(0, calculation.getDigitSum(0));
    }

    @Test
    public void getPerfectNumbersList() {
        List<Integer> perfectNumList = calculation.getPerfectNumbersList(-1);
        assertEquals(0, perfectNumList.size());
    }

    @Test
    public void getPerfectNumberList() {
        List<Integer> etalonPerfectNumList = Arrays.asList(6, 28, 496, 8128, 33550336);
        List<Integer> numList = etalonPerfectNumList.stream().filter(a -> (a <= 8128)).collect(Collectors.toList());
        List<Integer> perfectNumList = calculation.getPerfectNumbersList(8128);
        assertTrue(numList.equals(perfectNumList));
    }
}