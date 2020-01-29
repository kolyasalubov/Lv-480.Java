package puiko.vadym;

import latyk.borys.Algorythm;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MathOperationTest {

    @Test(expected = NumberFormatException.class)
    public void getSmallestNumber() {
        assertEquals(8, MathOperation.getSmallestNumber(5));
        assertNotEquals(new NumberFormatException(), MathOperation.getSmallestNumber(-2));
        assertSame(NumberFormatException.class, MathOperation.getSmallestNumber(1000000001));
    }

    @Test(expected = NumberFormatException.class)
    public void getSumOfThreeSquaresA() {
        List<String> values = new ArrayList<>();
        values.add("1 + 1 + 2");
        values.add("1 + 2 + 1");
        values.add("2 + 1 + 1");
        assertEquals(values, MathOperation.getSumOfThreeSquaresA(6));
        assertNotEquals(new NumberFormatException(), MathOperation.getSmallestNumber(-2));
        assertNotEquals(new NumberFormatException(), MathOperation.getSmallestNumber(-2));
    }

    @Test(expected = NumberFormatException.class)
    public void getSumOfThreeSquaresB() {
        assertEquals("1 + 1 + 2", MathOperation.getSumOfThreeSquaresB(6));
        assertEquals("not combination", MathOperation.getSumOfThreeSquaresB(15));
        assertNotEquals(new NumberFormatException(), MathOperation.getSmallestNumber(-2));
        assertNotEquals(new NumberFormatException(), MathOperation.getSmallestNumber(1000000001));
    }
}