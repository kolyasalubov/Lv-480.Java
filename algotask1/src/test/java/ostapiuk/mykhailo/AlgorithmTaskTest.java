package ostapiuk.mykhailo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlgorithmTaskTest {

    @Test
    public void sumLastDigits() {
        assertEquals(14, AlgorithmTask.sumLastDigits(3146167, 3));
    }

    @Test
    public void findCommonMultiple() {
        List<Long> list = Arrays.asList(18L, 36L);
        assertEquals(list, AlgorithmTask.findCommonMultiple(6,9));
    }

    @Test
    public void findMersenNumbers() {
        List <Long> list = Arrays.asList(1L, 3L, 7L, 15L, 31L, 63L);
        assertEquals(list,AlgorithmTask.findMersenNumbers(92));
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumLastDigitsBadFirstArgument() {
        AlgorithmTask.sumLastDigits(-5, 4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumLastDigitsBadSecondArgument() {
        AlgorithmTask.sumLastDigits(5, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findCommonMultipleBadFirstArgument(){
        AlgorithmTask.findCommonMultiple(-6,9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findCommonMultipleBadSecondArgument(){
        AlgorithmTask.findCommonMultiple(6,-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMersenNumbersBadArgument() {
        AlgorithmTask.findMersenNumbers(-92);
    }
}
