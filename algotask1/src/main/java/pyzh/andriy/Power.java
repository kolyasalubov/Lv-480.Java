package pyzh.andriy;

import java.util.logging.Logger;

public class Power {

    private static Logger log =
            Logger.getLogger(Power.class.getName());

    public static int find(int m) throws IllegalArgumentException {
        if (m <= 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        int k = 1;
        while (Math.pow(4, k + 1) < m) {
            k++;
        }
        return k;
    }


}
