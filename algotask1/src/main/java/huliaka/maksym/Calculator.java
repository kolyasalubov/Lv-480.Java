package huliaka.maksym;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * Java class with methods that realize algotasks
 * 86 а),  86 б) , 330
 */
public class Calculator {
    /**
     * constant number to use inside calculating methods
     */
    private final int numberTen = 10;

    /**
     * method that finds digits quantity of input number
     *
     * @param testNumber number to count digits quantity
     * @return result
     * best ever project
     */
    public int getDigitQuantity(final int testNumber) {
        int result = 1;
        int number = testNumber;
        while (abs(number) >= numberTen) {
            result++;
            number /= numberTen;
        }
        return result;
    }

    /**
     * method that calculates digits sum of input number
     *
     * @param number number to calculate digits sum
     * @return result
     * friendly fire
     */
    public int getDigitSum(final int number) {
        int result = 0;
        int testNumber = number;
        while (abs(testNumber) > 0) {
            result += abs(testNumber) % numberTen;
            testNumber /= numberTen;
        }
        return result;
    }


    /**
     * method that finds perfect numbers thet smaller than input number paramether
     *
     * @param number
     * @return resultList
     * majeed
     */
    public List<Integer> getPerfectNumbersList(final int number) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            int result = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    result += j;
                }
            }
            if (i == result) {
                resultList.add(result);
            }
        }
        return resultList;
    }
}
