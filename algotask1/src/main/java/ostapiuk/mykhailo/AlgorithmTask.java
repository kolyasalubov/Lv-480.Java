package ostapiuk.mykhailo;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmTask {

    private static final int TEN = 10;

    private AlgorithmTask() {

    }

    public static long sumLastDigits(long number, long digits) {
        if (number < 0 || digits < 0) {
            throw new IllegalArgumentException(
                    "Both arguments should be natural numbers");
        }
        long result = 0;
        for (; digits > 0; number /= TEN, digits--) {
            if (number == 0) {
                return result;
            }
            result += (number % TEN);
        }
        return result;
    }

    public static List<Long> findCommonMultiple(final long number1,
                                                final long number2) {
        if (number1 <= 0 || number2 <= 0) {
            throw new IllegalArgumentException(
                    "Both arguments should be natural numbers");
        }
        List<Long> result = new ArrayList<>();
        long threshold = number1 * number2;
        long i = number1 > number2 ? number1 : number2;
        long step = i;
        for (; i < threshold; i += step) {
            if (i % number1 == 0 && i % number2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Long> findMersenNumbers(final long threshold) {
        if (threshold < 0) {
            throw new IllegalArgumentException(
                    "Argument should be a natural number");
        }
        List<Long> numbers = new ArrayList<>();
        long mersenNumber = getMersenNumber(1);
        for (long i = 2; mersenNumber <= threshold; i++) {
            numbers.add(mersenNumber);
            mersenNumber = getMersenNumber(i);
        }
        return numbers;
    }

    private static long getMersenNumber(final long i) {
        return ((long) Math.pow(2, i)) - 1;
    }
}
