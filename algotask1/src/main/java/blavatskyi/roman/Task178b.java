package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task178b {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<>();
        integerList = readNumbersFromConsole();
        System.out.println("Natural numbers = " + integerList);
        int multiplesAmount = getAmountOfMultiples(integerList);
        System.out.println("Amount of multiples: " + multiplesAmount);
    }

    public static int getAmountOfMultiples(List<Integer> numbers) {
        int n = 0;
        System.out.println("Multiples of 3 and not multiples of 5:");
        for (Integer l : numbers) {
            if ((l % 3 == 0) && (l % 5 != 0)) {
                n++;
                System.out.print(l + " ");
            }
        }
        System.out.println();
        return n;
    }

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
        System.out.println("Options menu:\n" +
                "\tPress <- 1 -> to enter natural number.\n" +
                "\tPress <- 2 -> to exit.");
    }
}
