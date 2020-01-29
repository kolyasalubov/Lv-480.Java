package isachenko.dmytro;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void findsum() {
        assertEquals(9240,Task.findSum());
    }

    @Test
    public void reverse() {
        assertEquals(-123,Task.findReverse(-321));
        assertEquals(265,Task.findReverse(562));
    }

    @Test
    public void containsThree() {
        assertEquals(true,Task.containsThree(6));
        assertEquals(false,Task.containsThree(3));
    }
}