package blavatskyi.roman;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdTaskTest {

    @Test
    public void getAllPythagoreanTriplesOfNumber() {
        assertEquals(2, ThirdTask.getAllPythagoreanTriplesOfNumber(10));
    }
}