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
    public static void printAllPythagoreanTriplesOfNumber() throws IOException {
        logger.info("-------------------------------------------------------");
        logger.info("Given the natural number n. "
                + "\nObtain all Pythagorean triples of positive integers,"
                + "\neach of one does not exceed n."
                + "\na^2 + b^2 = c^2 (a <= b <= c <= n)");
        logger.info("-------------------------------------------------------");
        logger.info("Enter natural number: ");
        int n = Integer.parseInt(reader.readLine());
        logger.info("Pythagorean Triples: ");
        int pythagoreanTriples = getAllPythagoreanTriplesOfNumber(n);
        logger.info("Amount of Pythagorean Triples: " + pythagoreanTriples);
    }

    /**
     * This method is used to find Pythagorean triples of the number.
     *
     * @param number This is a variable used to find Pythagorean triples of
     * @return List This method return digital root of the number
     */
    public static int getAllPythagoreanTriplesOfNumber(int number) {
        int n = 0;
        for (int a = 1; a <= number; a++) {
            for (int b = 1; b <= number; b++) {
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double cRoot = Math.sqrt(cSquared);
                if ((cRoot == Math.ceil(cRoot)) && (a <= b) && (b <= cRoot)
                        && (cRoot <= number)) {
                    logger.info(a + "^2 + " + b + "^2 = "
                            + (int) cRoot + "^2");
                    n++;
                }
            }
        }
        return n;
    }

}
