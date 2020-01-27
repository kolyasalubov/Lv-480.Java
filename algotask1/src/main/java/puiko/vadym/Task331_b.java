package tasks;


public class Task331_b {

    public static String execute(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if ((n == (x*x + y*y + z*z))) {
                        return x + " + " + y + " + " + z;
                    }
                }
            }
        }
        return "not combination";
    }
}
