package andriypyzh;

import java.util.Scanner;
import java.util.logging.Logger;

public class FindPower {

    private static Logger log = Logger.getLogger(FindPower.class.getName());
    private static Scanner input = new Scanner(System.in);

    public static void main(final String... args) {
//        log.info(Integer.toString(findK(1000)));
        show();

    }

    public static int findPower(final int m) {
        final int four = 4;
        if (m <= 1) {
            log.info("Wrong number");
            return -1;
        }

        int k = 1;
        while (Math.pow(four, k + 1) < m) {
            k++;
        }
        return k;
    }

    public static void pressButton1() {
        System.out.println("Input natural number m:");
        int m = Integer.parseInt(input.nextLine());
        System.out.print("The largest k that 4^k < m is ");
        int k = findPower(m);
        if (k != -1) {
            System.out.println(findPower(m) + "\n");
        }
    }

    public static void outputMenu() {
        System.out.println("1 - input number\n" +
                "2 - exit");
    }

    public static void show() {
        String keyMenu;
        do {
            System.out.println("Please, select menu point:");
            outputMenu();

            keyMenu = input.nextLine();

            if (keyMenu.equals("1")) {
                pressButton1();
            } else if (!keyMenu.equals("2"))
                log.info("Invalid input");

        } while (!keyMenu.equals("2"));
    }

}
