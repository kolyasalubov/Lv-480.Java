package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task331_a {

    public static List<String> execute(int n) {
        List<String> values = new ArrayList<>();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if ((n == (x*x + y*y + z*z))) {
                        values.add(x + " + " + y + " + " + z);
                        break;
                    }
                }
            }
        }
        return values;
    }
}
