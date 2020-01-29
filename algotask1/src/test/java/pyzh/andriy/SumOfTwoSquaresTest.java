package pyzh.andriy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumOfTwoSquaresTest {
    @Test
    public void exist() {
        List<Integer> argsTrue = Arrays.asList(2, 10, 50, 97, 61);
        List<Integer> argsFalse = Arrays.asList(62, 30, 67, 96, 7);
        for (int i : argsTrue) {
            Assert.assertTrue(SumOfTwoSquares.exist(i));
        }
        for (int i : argsFalse) {
            Assert.assertFalse(SumOfTwoSquares.exist(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void existBadArguments() {
        SumOfTwoSquares.exist(-10);
    }

    @Test
    public void find() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(6, 43));
        expected.add(Arrays.asList(11, 42));
        expected.add(Arrays.asList(21, 38));
        expected.add(Arrays.asList(27, 34));

        List<List<Integer>> actual = SumOfTwoSquares.find(1885);

        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void findBadArguments() {
        SumOfTwoSquares.find(-100);
    }
}