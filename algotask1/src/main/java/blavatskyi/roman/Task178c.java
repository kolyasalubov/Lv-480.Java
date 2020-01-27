package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task178c {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<>();
        integerList = readNumbersFromConsole();
        System.out.println("Natural numbers = " + integerList);
        int squaresAmount = getAmountSquaresOfEvenNumbers(integerList);
        System.out.println("Amount of even squares: " + squaresAmount);

    }

    public static int getAmountSquaresOfEvenNumbers(List<Integer> numbers) {
        int n = 0;
        int digitalRoot;
        System.out.println("Numbers which are squares of even numbers:");
        for (Integer l : numbers) {
            digitalRoot = findDigitalRootOfNumber(l);
            if ((l % 2 == 0) && ((digitalRoot == 1) || (digitalRoot == 4)
                    || (digitalRoot == 7) || (digitalRoot == 9))) {
                n++;
                System.out.print(l + " ");
            }
        }
        System.out.println();
        return n;
    }

    private static int findDigitalRootOfNumber(int number) {
        int rootNumber = 0;
        while (number >= 1) {
            rootNumber = rootNumber + (number % 10);
            number /= 10;
        }
        if ((rootNumber / 10) >= 1) {
            rootNumber = findDigitalRootOfNumber(rootNumber);
        }
        return rootNumber;
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
