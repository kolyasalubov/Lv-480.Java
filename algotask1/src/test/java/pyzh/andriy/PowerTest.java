package pyzh.andriy;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PowerTest {

    @Test
    public void find() {
        List<Integer> args = Arrays.asList(10, 20, 90, 1000, 1500);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = new ArrayList<>();
        for (int i : args) {
            actual.add(Power.find(i));
        }
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void findBadArgument(){
        Power.find(-100);
    }
}