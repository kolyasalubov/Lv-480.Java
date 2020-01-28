package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingNumbersFromConsole {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static List<Integer> readNumbersFromConsole() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        int temp;
        boolean flag = true;
        while (flag) {
            printMenu();
            temp = Integer.parseInt(reader.readLine());
            if (temp == 1) {
                System.out.println("Enter your number: ");
                temp = Integer.parseInt(reader.readLine());
                numbers.add(temp);
            } else if (temp == 2) {
                flag = false;
            } else {
                System.out.println("Invalid option selected. ");
                flag = false;
            }
        }
        return numbers;
    }

    private static void printMenu() {
        System.out.println("Options menu:\n"
                + "\tPress <- 1 -> to enter natural number.\n"
                + "\tPress <- 2 -> to exit.");
    }
}
