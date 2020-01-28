package latyk.borys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Algorythm {
    /**
     * Static variable for data input.
     * Created by Borys Latyk on 24/01/2020.
     */
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static Logger logger = Logger.getLogger(Algorythm.class.getName());

    public static int swapDigits() throws IOException {
        logger.info("Please enter a value");
        StringBuilder builder = new StringBuilder();

        builder.append(reader.readLine());
        String start = builder.substring(0, 1);
        String end = builder.substring(builder.length() - 1);

        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length() - 1);
        builder.insert(0, end);
        builder.append(start);

        int number = Integer.parseInt(String.valueOf((builder)));
        return number;
    }

    public static int addDigits() throws IOException {
        logger.info("Please enter a value");
        StringBuilder builder = new StringBuilder();

        builder.append(reader.readLine());
        builder.insert(0, "1");
        builder.append("1");

        int updatedNumber = Integer.parseInt(String.valueOf(builder));
        return updatedNumber;
    }

    public static ArrayList<Integer> checkTheorem() throws IOException {
        ArrayList<Integer> lagrangeDigits = new ArrayList<Integer>();
        logger.info("Please enter a value");
        int number = Integer.parseInt(reader.readLine());
        int temporaryNumber = number;

        int firstDigit = (int) Math.sqrt(temporaryNumber);
        temporaryNumber = temporaryNumber - firstDigit * firstDigit;

        int secondDigit = (int) Math.sqrt(temporaryNumber);
        temporaryNumber = temporaryNumber - secondDigit * secondDigit;

        int thirdDigit = (int) Math.sqrt(temporaryNumber);
        temporaryNumber = temporaryNumber - thirdDigit * thirdDigit;

        int fourthDigit = (int) Math.sqrt(temporaryNumber);

        lagrangeDigits.add(number);
        lagrangeDigits.add(firstDigit);
        lagrangeDigits.add(secondDigit);
        lagrangeDigits.add(thirdDigit);
        lagrangeDigits.add(fourthDigit);

        return lagrangeDigits;
    }
}
