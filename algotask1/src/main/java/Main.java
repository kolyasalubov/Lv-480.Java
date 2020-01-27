import huliaka.maksym.Calculator;

import isachenko.dmytro.Task;

import latyk.borys.Algorythm;
import pyzh.andriy.Power;
import pyzh.andriy.SumOfTwoSquares;

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

            //Isachenko
            case ("88а"):
                System.out.println(Task.containsThree(inputValue));
                break;
            case ("88b"):
                System.out.println(Task.reverse(inputValue));
                break;
            case ("322"):
                System.out.println(Task.findsum());
                break;
                //Isachenko Dima

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

            //Andriy Pyzh
            case ("107"):
                System.out.println(Power.find(inputValue));
                break;
            case ("243a"):
                System.out.println(SumOfTwoSquares.exist(inputValue));
                break;
            case ("243b"):
                System.out.println(SumOfTwoSquares.find(inputValue));
                break;
            // Andriy Pyzh

        }
    }
}
