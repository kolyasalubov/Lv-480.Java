import huliaka.maksym.Calculator;
import isachenko.dmytro.Task;

public class Main {
    public static void main(String[] args) {
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
            case ("88а"):
                System.out.println(Task.containsThree(inputValue));
                break;
            case ("88b"):
                System.out.println(Task.findReverse(inputValue));
                break;
            case ("322"):
                System.out.println(Task.findSum());
                break;
                //Isachenko Dima
            case (""):
                break;
        }
    }
}
