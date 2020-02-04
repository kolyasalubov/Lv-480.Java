package blavatskyi.roman;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FirstTaskTest {

    @Test(timeout = 200)
    public void getAmountOfMultiples() {
        List<Integer> numbers = Arrays.asList(3,5,6,9,10);
        assertEquals(3, FirstTask.getAmountOfMultiples(numbers));
    }
}