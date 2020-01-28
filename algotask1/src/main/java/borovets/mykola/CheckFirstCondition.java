package borovets.mykola;

import blavatskyi.roman.ReadingNumbersFromConsole;

import java.io.IOException;
import java.util.List;


public class CheckFirstCondition  {
     public static int checkCount(final List<Integer> nums) {
        int count = 0;
        for (int k = 1; k < nums.size() - 1; k++) {
            if (nums.get(k) < (nums.get(k - 1) + nums.get(k + 1)) / 2) {
                count++;
            }
        }
        return count;
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