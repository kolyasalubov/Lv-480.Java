package isachenko.dmytro;

public class Task {
    public static int findsum() {
        final int thousand  = 10000;
        int summax = 0;
        int number = 0;
        for (int i = 1; i <= thousand; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > summax) {
                summax = sum;
                number = i;
            }
        }
        return number;
    }
    public static int reverse(final int n) {
        final int ten = 10;
        int st = n;
        int r = 0;
        while (st != 0) {
            r = r * ten + st % ten;
            st = st / ten;
        }
        return r;
    }
     public static boolean containsThree(final int n) {
        int number = n * n;
        String strNumber = String.valueOf(number);
        return strNumber.contains("3");
    }
}
