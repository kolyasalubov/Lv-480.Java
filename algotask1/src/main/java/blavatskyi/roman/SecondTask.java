package blavatskyi.roman;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

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
     * {@link SecondTask#DIGIT_ROOT_ONE}.
     */
    private static final int DIGIT_ROOT_ONE = 1;
    /**
     * {@link SecondTask#DIGIT_ROOT_FOUR}.
     */
    private static final int DIGIT_ROOT_FOUR = 4;
    /**
     * {@link SecondTask#DIGIT_ROOT_SEVEN}.
     */
    private static final int DIGIT_ROOT_SEVEN = 7;
    /**
     * {@link SecondTask#DIGIT_ROOT_NINE}.
     */
    private static final int DIGIT_ROOT_NINE = 9;
    /**
     * {@link SecondTask#TEN}.
     */
    private static final int TEN = 10;
    /**
     * Variable of class Logger is used to display message in console.
     */
    private static Logger logger =
            Logger.getLogger(ReadingNumbersFromConsole.class.getName());

    /**
     * This method is used to find the number of sequence members
     * that are squares of even numbers.
     * <p>
     * that are squares of even numbers.
     *
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static void printAmountSquaresOfEvenNumbers() throws IOException {
        logger.info("-------------------------------------------------------");
        logger.info("Given the natural numbers n, a1...an. "
                + "\nDetermine the number of sequence members "
                + "that are squares of even numbers.");
        logger.info("-------------------------------------------------------");
        List<Integer> numbers =
                ReadingNumbersFromConsole.readNumbersFromConsole();
        logger.info("Natural numbers = " + numbers);
        logger.info("Numbers which are squares of even numbers:");
        int amountOfSquares = getAmountSquaresOfEvenNumbers(numbers);
        logger.info("Amount of sequence members "
                + "that are squares of even numbers: "
                + amountOfSquares);

    }

    /**
     * This method is used to find the number of squares of even numbers.
     *
     * @param integers This is sequence of natural numbers
     * @return List This method return amount of squares of even numbers
     */
    public static int getAmountSquaresOfEvenNumbers(List<Integer> integers) {
        int n = 0;
        int digitalRoot;
        for (Integer l : integers) {
            digitalRoot = findDigitalRootOfNumber(l);
            if ((l % 2 == 0) && ((digitalRoot == DIGIT_ROOT_ONE)
                    || (digitalRoot == DIGIT_ROOT_FOUR)
                    || (digitalRoot == DIGIT_ROOT_SEVEN)
                    || (digitalRoot == DIGIT_ROOT_NINE))) {
                n++;
                logger.info(l + " ");
            }
        }
        return n;
    }

    /**
     * This method is used to find digital root of the number.
     *
     * @param number This is a variable used to find digital root of
     * @return List This method return digital root of the number
     */
    public static int findDigitalRootOfNumber(int number) {
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
