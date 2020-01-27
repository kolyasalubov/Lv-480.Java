package andriypyzh;

import java.util.*;
import java.util.logging.Logger;


public class ToSumOfTwoSquares {

    private static Logger log = Logger.getLogger(
            ToSumOfTwoSquares.class.getName());
    private static Scanner input = new Scanner(System.in);

    public static void main(final String... args) {

//        int n = 1885;
//
//        log.info(Boolean.toString(existSumOfTwoSquares(n)));
//        log.info(findSumOfTwoSquares(n).toString());

        show();

    }


    public static List<List<Integer>> findSumOfTwoSquares(final int m) {
        ArrayList<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i * i < m; i++) {
            for (int j = i; j * j <= m - i * i; j++) {
                if (i * i + j * j == m) {
                    pairs.add(Arrays.asList(i, j));
                }
            }
        }
        return pairs;
    }


    public static boolean existSumOfTwoSquares(final int m) {
        List<Integer> factors = factorizeNumber(m);

        Set<Integer> uniqueFactors = new HashSet<>(factors);

        for (Integer i : uniqueFactors) {
            if (i % 4 == 3 && factors.stream().
                    filter(x -> x.equals(i)).
                    count() % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    public static List<Integer> factorizeNumber(final int arg) {
        int number = arg;
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

    public static void pressButton1() {
        System.out.println("Input natural number m:");
        int m = Integer.parseInt(input.nextLine());

        boolean exist = existSumOfTwoSquares(m);
        if (exist) {
            System.out.format("Number %d can be represented"
                    + " as sum of two squares\n\n", m);
        } else {
            System.out.format("Number %d cannot be represented"
                    + " as sum of two squares\n\n", m);
        }
    }

    public static void pressButton2() {
        System.out.println("Input natural number m:");
        int m = Integer.parseInt(input.nextLine());

        List<List<Integer>> squares = findSumOfTwoSquares(m);
        if (squares.isEmpty()) {
            System.out.println("Number cannot be represented "
                    + "as sum of two squares\n");
        } else {
            for (List<Integer> pair : squares) {
                System.out.format("x = %d, y = %d\n", pair.get(0), pair.get(1));
            }
        }
    }

    public static void outputMenu() {
        System.out.println(
                "1 - check if number can be represented as sum of two squares\n"
                + "2 - find all x,y that x^2 + y^2 = n\n"
                + "3 - EXIT");
    }

    public static void show() {
        String keyMenu;
        do {
            System.out.println("Please, select menu point:");
            outputMenu();

            keyMenu = input.nextLine();

            if (keyMenu.equals("1")) {
                pressButton1();
            } else if (keyMenu.equals("2")) {
                pressButton2();
            } else if (!keyMenu.equals("3")) {
                log.info("Invalid input");
            }
        } while (!keyMenu.equals("3"));
    }

}

