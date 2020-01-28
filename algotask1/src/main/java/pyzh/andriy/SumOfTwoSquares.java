package pyzh.andriy;

import java.util.*;
import java.util.logging.Logger;

public class SumOfTwoSquares {

    private static Logger log =
            Logger.getLogger(SumOfTwoSquares.class.getName());

    public static List<List<Integer>> find(final int number) {
        if (number <= 1) {
            log.info("Wrong number");
        }
        if (!exist(number)) {
            log.info("Number cannot be represented as sum of two squares");
        }
        ArrayList<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i * i < number; i++) {
            for (int j = i; j * j <= number - i * i; j++) {
                if (i * i + j * j == number) {
                    pairs.add(Arrays.asList(i, j));
                }
            }
        }
        return pairs;
    }


    public static boolean exist(final int m) {
        List<Integer> factors = factorizeNumber(m);

        Set<Integer> uniqueFactors = new HashSet<>(factors);

        for (Integer i : uniqueFactors) {
            if (i % 4 == 3 && factors.stream().
                    filter(x -> x.equals(i)).
                    count() % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    private static List<Integer> factorizeNumber(final int arg) {
        int number = arg;
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

}

