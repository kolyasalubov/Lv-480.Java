
    import borovets.mykola.FirstCondition;
    import borovets.mykola.SecondCondition;
    import huliaka.maksym.Calculator;

    import isachenko.dmytro.Task;

    import latyk.borys.Algorythm;

    import puiko.vadym.MathOperation;

    import pyzh.andriy.Power;
    import pyzh.andriy.SumOfTwoSquares;

    import blavatskyi.roman.*;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.logging.Logger;


    public class Main {
        public static Logger logger = Logger.getLogger(Main.class.getName());

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean flag = true;
            int temp;
            do {
                printMenu();
                temp = Integer.parseInt(reader.readLine());
                if (temp == 1) {
                    logger.info("Enter number of your task:");
                    String inputChoice = reader.readLine();
                    switch (inputChoice) {

                        //Roman Blavatskyi
                        case ("178b"):
                            logger.info("Amount of sequence members "
                                    + "by multiples of 3 and not multiples of 5: "
                                    + FirstTask.getAmountOfMultiples());
                            break;
                        case ("178c"):
                            logger.info("Amount of sequence members "
                                    + "that are squares of even numbers: "
                                    + SecondTask.getAmountSquaresOfEvenNumbers());
                            break;
                        case ("554"):
                            ThirdTask.getAllPythagoreanTriplesOfNumber();
                            break;
                        //Roman Blavatskyi

                        //Mykola Borovets
                        case ("178e"):
                            logger.info("Amount of sequence members: "
                                    + FirstCondition.getAmountOfNumbers());
                            break;
                        case ("178d"):
                            logger.info("Amount of sequence members: "
                                    + SecondCondition.getAmountOfNumbers());
                            break;
                        //Mykola Borovets

                        //Maksym Huliaka
                        case ("86a"):
                            logger.info("Number to calculate digit quantity");
                            int inputValue = Integer.parseInt(reader.readLine());
                            logger.info(String.valueOf(Calculator.getDigitQuantity(inputValue)));
                            break;
                        case ("86b"):
                            logger.info("Number to calculate digit sum");
                            int inputValue2 = Integer.parseInt(reader.readLine());
                            logger.info(String.valueOf(Calculator.getDigitSum(inputValue2)));
                            break;
                        case ("330"):
                            logger.info("perfect numbers that lower than number:");
                            int inputValue3 = Integer.parseInt(reader.readLine());
                            logger.info(String.valueOf(Calculator.getPerfectNumbersList(inputValue3).toString()));
                            break;
                        //Maksym Huliaka

                        //Borys Latyk
                        case ("88в"):
                            logger.info("Please enter a value");
                            logger.info("Swap the first and the last digit "
                                    + Algorythm.swapDigits(reader.readLine()));
                            break;
                        case ("88г"):
                            logger.info("Please enter a value");
                            logger.info("Add digit 1 to the beginning end to the end of number "
                                    + Algorythm.addDigits(reader.readLine()));
                            break;
                        case ("332"):
                            logger.info("Please enter a value");
                            logger.info("Lagrange theorem " +
                            Algorythm.checkTheorem(reader.readLine()));
                            break;
                        //Borys Latyk

                        //Puiko Vadym
                        case ("108"):
                            logger.info("Дано натуральне число n. Отримати найменше число 2^r, яке перевищює n."
                                    + "\n" + "Enter n: ");
                            logger.info(String.valueOf(MathOperation.getSmallestNumber(Integer.parseInt(reader.readLine()))));
                            break;
                        case ("331a"):
                            logger.info("Дано натуральне число n. Чи можливо представити його у виді суми трьох квадратів натуальних чисел. " +
                                    "\n" + "Якщо можна, то вказати трійку x, y, z таких натуральних чисел," +
                                    "що n = x^2 + y^2 + z^2" + "\n" + "Enter n: ");
                            MathOperation.getSumOfThreeSquaresA(Integer.parseInt(reader.readLine())).forEach(value -> logger.info(value));
                            break;
                        case ("331b"):
                            logger.info("Дано натуральне число n. Чи можливо представити його у виді суми трьох квадратів натуальних чисел. " +
                                    "\n" + "Якщо можна, то вказати всю трійку x, y, z таких натуральних чисел," +
                                    "що n = x^2 + y^2 + z^2" + "\n" + "Enter n: ");
                            logger.info(MathOperation.getSumOfThreeSquaresB(Integer.parseInt(reader.readLine())));
                            break;
                        //Puiko Vadym

                        //Andriy Pyzh
                        case ("107"):
                            logger.info("Given number m > 1. Find k that 4 ^ k < m.\n" +
                                    "Input m:");
                            int inputNumber1 = Integer.parseInt(reader.readLine());
                            logger.info("k = " + Power.find(inputNumber1));
                            break;
                        case ("243a"):
                            logger.info("Given number m > 1. Can number m be represented as sum of squares?\n" +
                                    "Input m: ");
                            int inputNumber2 = Integer.parseInt(reader.readLine());
                            logger.info("result: " + SumOfTwoSquares.exist(inputNumber2));
                            break;
                        case ("243b"):
                            logger.info("Given number m > 1. Find all x, y that x ^ 2 + y ^ 2 = m " +
                                    "Input m: ");
                            int inputNumber3 = Integer.parseInt(reader.readLine());
                            logger.info("result: " + SumOfTwoSquares.find(inputNumber3));
                            break;
                        //Andriy Pyzh

                        //Dmytro Isachenko
                        case ("88а"):
                            int inputNumber11=Integer.parseInt(reader.readLine());
                            logger.info("is there a number 3 "
                                    + Task.containsThree(inputNumber11));
                            break;
                        case ("88b"):
                            int inputNumber22=Integer.parseInt(reader.readLine());
                            logger.info("reverse number "
                                    + Task.findReverse(inputNumber22));
                            break;
                        case ("322"):
                            logger.info("the number from 1 to 10000 with the maximum sum of divisors " +
                                    Task.findSum());
                            break;
                        //Isachenko Dmytro
                    }
                } else {
                    flag = false;
                }
            }
            while (flag);
        }

        private static void printMenu() {
            logger.info("Options menu:\n"
                    + "\tPress <- 1 -> to solve logical tasks.\n"
                    + "\tPress <- 2 -> to exit.");
        }
    }
