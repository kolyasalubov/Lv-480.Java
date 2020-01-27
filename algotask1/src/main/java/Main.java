import huliaka.maksym.Calculator;
import latyk.borys.Algorythm;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputChoise = args[0];
        int inputValue = Integer.valueOf(args[1]);

        switch (inputChoise) {

            //Huliaka Maksym
            case ("86a"):
                System.out.println(Calculator.getDigitQuantity(inputValue));
                break;
            case ("86b"):
                System.out.println(Calculator.getDigitSum(inputValue));
                break;
            case ("86c"):
                System.out.println(Calculator.getPerfectNumbersList(inputValue).toString());
                break;
            //Huliaka Maksym

            //Latyk Borys
            case ("88в"):
                System.out.println(Algorythm.swapDigits());
                break;
            case ("88г"):
                System.out.println(Algorythm.addDigits());
                break;
            case ("332"):
                System.out.println(Algorythm.checkTheorem());
                break;
            //Latyk Borys
        }
    }
}
