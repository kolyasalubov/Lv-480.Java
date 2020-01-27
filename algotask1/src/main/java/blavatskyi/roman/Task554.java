package blavatskyi.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task554 {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        getAllPythagoreanTriplesOfNumber();
    }

    public static void getAllPythagoreanTriplesOfNumber() throws IOException {
        System.out.println("Enter natural number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Pythagorean Triples: ");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double cRoot = Math.sqrt(cSquared);
                if ((cRoot == Math.ceil(cRoot)) && (a <= b) && (b <= cRoot) &&
                        (cRoot <= n)) {
                    System.out.println(a + "^2 + " + b + "^2 = "
                            + (int) cRoot + "^2");
                }
            }

        }
    }

}
