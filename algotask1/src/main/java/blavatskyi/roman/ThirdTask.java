package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * The ThirdTask program implements logical task
 * "Pythagorean triples of positive integers".
 *
 * @author Roman Blavatskyi
 * @version 1.0
 * @since 2020-27-01
 */
public class ThirdTask {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    /**
     * This method is used to find all Pythagorean triples of positive integers
     *
     * @return int This method returns Pythagorean triples of positive integers
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static void getAllPythagoreanTriplesOfNumber() throws IOException {
        System.out.println("------------------------------------------------");
        System.out.println("Given the natural number n. "
                + "\nObtain all Pythagorean triples of positive integers,"
                + "\neach of one does not exceed n."
                + "\na^2 + b^2 = c^2 (a <= b <= c <= n)");
        System.out.println("------------------------------------------------");
        System.out.println("Enter natural number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Pythagorean Triples: ");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double cRoot = Math.sqrt(cSquared);
                if ((cRoot == Math.ceil(cRoot)) && (a <= b) && (b <= cRoot)
                        && (cRoot <= n)) {
                    System.out.println(a + "^2 + " + b + "^2 = "
                            + (int) cRoot + "^2");
                }
            }
        }
    }

}
