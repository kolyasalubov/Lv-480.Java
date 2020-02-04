package isachenko.dmytro;

public class Task {
    public static int findSum() {
        final int tenThousand  = 10000;
        int summax = 0;
        int numberI = 0;
        for (int i = 1; i <= tenThousand; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > summax) {
                summax = sum;
                numberI = i;
            }
        }
        return numberI;
    }
    public static int findReverse(final int n) {
        int intputNumber = n;
        int result = 0;
        while (intputNumber != 0) {
            result = result * 10 + intputNumber % 10;
            intputNumber = intputNumber / 10;
        }
        return result;
    }
     public static boolean containsThree(final int n) {
        int number = n * n;
        String strNumber = String.valueOf(number);
        return strNumber.contains("3");
    }
}
