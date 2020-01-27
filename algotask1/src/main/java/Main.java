import huliaka.maksym.Calculator;

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

            case (""):
                break;
        }
    }
}
