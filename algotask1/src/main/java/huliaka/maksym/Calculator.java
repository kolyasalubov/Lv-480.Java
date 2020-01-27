
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * com.softserve is a group of bar utils for operating on task things.
 */
public class Calculator {
    /**
     * Some text here.
     */
    private final int numberTen = 10;

    /**
     * Some text here.
     *
     * @param testNumber makes me happy
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
     * Some text here.
     *
     * @param number makes me hddappy
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
     * Some text here.
     *
     * @param number makes me hddappy
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
