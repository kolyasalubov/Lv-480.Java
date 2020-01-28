package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReadingNumbersFromConsole {
    /**
     * Variable of class Logger is used to display message in console.
     */
    private static Logger logger =
            Logger.getLogger(ReadingNumbersFromConsole.class.getName());
    /**
     * Variable of class BufferedReader is used to read user input.
     */
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    /**
     * This method is used to read numbers of sequence from console.
     *
     * @return List This method returns list of Integers
     * @throws IOException This method throws IOException
     *                     due to reading user input
     */
    public static List<Integer> readNumbersFromConsole() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        int temp;
        boolean flag = true;
        while (flag) {
            printMenu();
            temp = Integer.parseInt(reader.readLine());
            if (temp == 1) {
                logger.info("Enter your number: ");
                temp = Integer.parseInt(reader.readLine());
                numbers.add(temp);
            } else if (temp == 2) {
                flag = false;
            } else {
                logger.info("Invalid option selected. ");
                flag = false;
            }
        }
        return numbers;
    }

    private static void printMenu() {
        logger.info("Options menu:\n"
                + "\tPress <- 1 -> to enter natural number.\n"
                + "\tPress <- 2 -> to exit.");
    }
}
