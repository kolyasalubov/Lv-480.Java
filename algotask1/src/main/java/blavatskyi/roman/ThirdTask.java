package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;


/**
 * The ThirdTask program implements logical task
 * "Pythagorean triples of positive integers".
 *
 * @author Roman Blavatskyi
 * @version 1.0
 * @since 2020-27-01
 */
public class ThirdTask {
    /**
     * Variable of class BufferedReader is used to read user input.
     */
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    /**
     * Variable of class Logger is used to display message in console.
     */
    private static Logger logger =
            Logger.getLogger(ReadingNumbersFromConsole.class.getName());

    /**
     * This method is used to find all Pythagorean triples of positive integers.
     *
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static void getAllPythagoreanTriplesOfNumber() throws IOException {
        logger.info("-------------------------------------------------------");
        logger.info("Given the natural number n. "
                + "\nObtain all Pythagorean triples of positive integers,"
                + "\neach of one does not exceed n."
                + "\na^2 + b^2 = c^2 (a <= b <= c <= n)");
        logger.info("-------------------------------------------------------");
        logger.info("Enter natural number: ");
        int n = Integer.parseInt(reader.readLine());
        logger.info("Pythagorean Triples: ");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double cRoot = Math.sqrt(cSquared);
                if ((cRoot == Math.ceil(cRoot)) && (a <= b) && (b <= cRoot)
                        && (cRoot <= n)) {
                    logger.info(a + "^2 + " + b + "^2 = "
                            + (int) cRoot + "^2");
                }
            }
        }
    }

}
