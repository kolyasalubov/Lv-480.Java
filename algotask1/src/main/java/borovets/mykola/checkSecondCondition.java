package borovets.mykola;

import blavatskyi.roman.ReadingNumbersFromConsole;

import java.io.IOException;
import java.util.List;

public class checkSecondCondition  {
    public static int checkCount(final List<Integer> nums) {
        int count = 0;
        for (int k = 1; k < nums.size() - 1; k++) {
            int element = nums.get(k);
            if (Math.pow(2, k) < nums.get(k)
                    & nums.get(k) > calculateFactorial(k)) {
                count++;
            }
        }
        return count;
    }

    static int calculateFactorial(final int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static int getAmountSquaresOfEvenNumbers1() throws IOException {
        System.out.println("------------------------------------------------");
        System.out.println("Given the natural numbers n, a1...an. "
                + "\nDetermine the number of sequence members "
                + "that are squares of even numbers.");
        System.out.println("------------------------------------------------");
        List<Integer> numbers =
                ReadingNumbersFromConsole.readNumbersFromConsole();
        System.out.println("Natural numbers = " + numbers);
        System.out.println("CheckResult: " + checkCount(numbers));
        return checkCount(numbers);
    }
}


