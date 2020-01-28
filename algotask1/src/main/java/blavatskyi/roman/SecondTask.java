package blavatskyi.roman;

import java.io.IOException;
import java.util.List;

/**
 * The SecondTask program implements logical task
 * "Squares of even numbers".
 *
 * @author Roman Blavatskyi
 * @version 1.0
 * @since 2020-27-01
 */
public class SecondTask {
    /**
     * {@link SecondTask#DIGIT_ROOT_ONE}
     */
    private static final int DIGIT_ROOT_ONE = 1;
    /**
     * {@link SecondTask#DIGIT_ROOT_FOUR}
     */
    private static final int DIGIT_ROOT_FOUR = 4;
    /**
     * {@link SecondTask#DIGIT_ROOT_SEVEN}
     */
    private static final int DIGIT_ROOT_SEVEN = 7;
    /**
     * {@link SecondTask#DIGIT_ROOT_NINE}
     */
    private static final int DIGIT_ROOT_NINE = 9;
    /**
     * {@link SecondTask#TEN}
     */
    private static final int TEN = 10;

    /**
     * This method is used to find the number of sequence members
     * that are squares of even numbers.
     *
     * @return int This method returns amount of sequence members
     * that are squares of even numbers.
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static int getAmountSquaresOfEvenNumbers() throws IOException {
        System.out.println("------------------------------------------------");
        System.out.println("Given the natural numbers n, a1...an. "
                + "\nDetermine the number of sequence members "
                + "that are squares of even numbers.");
        System.out.println("------------------------------------------------");
        List<Integer> numbers =
                ReadingNumbersFromConsole.readNumbersFromConsole();
        System.out.println("Natural numbers = " + numbers);
        int n = 0;
        int digitalRoot;
        System.out.println("Numbers which are squares of even numbers:");
        for (Integer l : numbers) {
            digitalRoot = findDigitalRootOfNumber(l);
            if ((l % 2 == 0) && ((digitalRoot == DIGIT_ROOT_ONE)
                    || (digitalRoot == DIGIT_ROOT_FOUR)
                    || (digitalRoot == DIGIT_ROOT_SEVEN)
                    || (digitalRoot == DIGIT_ROOT_NINE))) {
                n++;
                System.out.print(l + " ");
            }
        }
        System.out.println();
        return n;
    }

    private static int findDigitalRootOfNumber(int number) {
        int rootNumber = 0;
        while (number >= 1) {
            rootNumber = rootNumber + (number % TEN);
            number /= TEN;
        }
        if ((rootNumber / TEN) >= 1) {
            rootNumber = findDigitalRootOfNumber(rootNumber);
        }
        return rootNumber;
    }
}
