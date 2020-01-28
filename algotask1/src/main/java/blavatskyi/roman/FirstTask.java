package blavatskyi.roman;

import java.io.IOException;
import java.util.List;

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
     * {@link FirstTask#THREE}
     */
    private static final int THREE = 3;
    /**
     * {@link FirstTask#FIVE}
     */
    private static final int FIVE = 5;

    /**
     * This method is used to find the number of sequence members
     * by multiples of 3 and not multiples of 5.
     *
     * @return int This method returns amount of multiples of 3
     * and not multiples of 5
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static int getAmountOfMultiples() throws IOException {
        System.out.println("------------------------------------------------");
        System.out.println("Given the natural numbers n, a1...an. "
                + "\nDetermine the number of sequence members "
                + "by multiples of 3 and not multiples of 5.");
        System.out.println("------------------------------------------------");
        List<Integer> numbers =
                ReadingNumbersFromConsole.readNumbersFromConsole();
        System.out.println("Natural numbers = " + numbers);
        int n = 0;
        System.out.println("Multiples of 3 and not multiples of 5:");
        for (Integer l : numbers) {
            if ((l % THREE == 0) && (l % FIVE != 0)) {
                n++;
                System.out.print(l + " ");
            }
        }
        System.out.println();
        return n;
    }
}
