package puiko.vadym;

import java.util.ArrayList;
import java.util.List;

/*
 * Tasks realized in methods
 * 108, 331 a), 331 b)
 */

public class MathOperation {

    /* Дано натуральне число n. Отримати найменше число 2^r, яке перевищює n. */

    public static int getSmallestNumber(final int n) {
        int r = 1;
        while (r <= n) {
            r = r * 2;
        }
        return r;
    }

    /* Дано натуральне число n. Можливо представити його у виді суми трьох квадратів натуальних чисел.
    Якщо можна, то вказати трійку x, y, z таких натуральних чисел, що n = x^2 + y^2 + z^2. */

    public static List<String> getSumOfThreeSquaresA(final int n) {
        List<String> values = new ArrayList<>();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if ((n == (x * x + y * y + z * z))) {
                        values.add(x + " + " + y + " + " + z);
                        break;
                    }
                }
            }
        }
        return values;
    }

    /* Дано натуральне число n. Можливо представити його у виді суми трьох квадратів натуальних чисел.
        Якщо можна, то вказати всю трійку x, y, z таких натуральних чисел, що n = x^2 + y^2 + z^2 */

    public static String getSumOfThreeSquaresB(final int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if ((n == (x * x + y * y + z * z))) {
                        return x + " + " + y + " + " + z;
                    }
                }
            }
        }
        return "not combination";
    }
}
