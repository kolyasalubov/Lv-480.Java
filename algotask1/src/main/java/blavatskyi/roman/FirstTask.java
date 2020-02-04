package blavatskyi.roman;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * The FirstTask program implements logical task
 * "Multiples of 3 and not multiples of 5".
 *
 * @author Roman Blavatskyi
 * @version 1.0
 * @since 2020-27-01
 */
public class FirstTask {

    /**
     * {@link FirstTask#THREE}.
     */
    private static final int THREE = 3;
    /**
     * {@link FirstTask#FIVE}.
     */
    private static final int FIVE = 5;
    /**
     * Variable of class Logger is used to display message in console.
     */
    private static Logger logger =
            Logger.getLogger(ReadingNumbersFromConsole.class.getName());

    /**
     * This method is used to print the number of sequence members
     * by multiples of 3 and not multiples of 5.
     *
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static void printAmountOfMultiples() throws IOException {
        logger.info("-------------------------------------------------------");
        logger.info("Given the natural numbers n, a1...an. "
                + "\nDetermine the number of sequence members "
                + "by multiples of 3 and not multiples of 5.");
        logger.info("-------------------------------------------------------");
        List<Integer> numbers =
                ReadingNumbersFromConsole.readNumbersFromConsole();
        logger.info("Natural numbers = " + numbers);
        logger.info("Multiples of 3 and not multiples of 5:");
        int amountOfMultiples = getAmountOfMultiples(numbers);
        logger.info("Amount of sequence members "
                + "by multiples of 3 and not multiples of 5: "
                + amountOfMultiples);

    }


    /**
     * This method is used to find the number of sequence members
     * by multiples of 3 and not multiples of 5.
     *
     * @param integers This is sequence of natural numbers
     * @return List This method return amount of multiples
     */
    public static int getAmountOfMultiples(List<Integer> integers) {
        int n = 0;
        for (Integer l : integers) {
            if ((l % THREE == 0) && (l % FIVE != 0)) {
                n++;
                logger.info(l + " ");
            }
        }
        return n;
    }
}
