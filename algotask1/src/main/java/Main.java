import blavatskyi.roman.FirstTask;
import blavatskyi.roman.SecondTask;
import blavatskyi.roman.ThirdTask;
import huliaka.maksym.Calculator;

import isachenko.dmytro.Task;

import latyk.borys.Algorythm;

import ostapiuk.mykhailo.AlgorithmTask;
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
                        FirstTask.printAmountOfMultiples();
                        break;
                    case ("178c"):
                        SecondTask.printAmountSquaresOfEvenNumbers();
                        break;
                    case ("554"):
                        ThirdTask.printAllPythagoreanTriplesOfNumber();
                        break;
                    //Roman Blavatskyi

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

                    //Ostapiuk Mykhailo
                    case ("87"):
                        logger.info("Sum last m digits of n number:");
                        logger.info("Input your number: ");
                        long inputValue4 = Long.parseLong(reader.readLine());
                        logger.info("Input amount of last digits: ");
                        long inputValue5 = Long.parseLong(reader.readLine());
                        logger.info("result: " + AlgorithmTask.sumLastDigits(inputValue4, inputValue5));
                        break;
                    case ("226"):
                        logger.info("Find multiple to n, m less then m*n");
                        logger.info("Input number1: ");
                        long inputValue6 = Long.parseLong(reader.readLine());
                        logger.info("Input number2: ");
                        long inputValue7 = Long.parseLong(reader.readLine());
                        logger.info("result: " + AlgorithmTask.findCommonMultiple(inputValue6, inputValue7));
                        break;
                    case ("559"):
                        logger.info("Find all Mersen numbers less then n: ");
                        logger.info("Input number: ");
                        int inputValue8 = Integer.parseInt(reader.readLine());
                        logger.info("result: " + AlgorithmTask.findMersenNumbers(inputValue8));
                        break;
                    //Ostapiuk Mykhailo

                    //Dmytro Isachenko
                    case ("88a"):
                        logger.info("Solution shows is square of the input number contains 3");
                        logger.info("Enter number:");
                        int inputNumber11=Integer.parseInt(reader.readLine());
                        logger.info("Is there a number 3: "
                                + Task.containsThree(inputNumber11));
                        break;
                    case ("88b"):
                        logger.info("Solution shows inverted number to input number");
                        logger.info("Enter number:");
                        int inputNumber22=Integer.parseInt(reader.readLine());
                        logger.info("Inverted number: "
                                + Task.findReverse(inputNumber22));
                        break;
                    case ("322"):
                        logger.info("the number from 1 to 10000 with the maximum sum of divisors " +
                                Task.findSum());
                        break;
                    //Isachenko Dmytro

                    default:
                        logger.info("No such task number. Please input another number from list: ");
                        logger.info("86a, 86b, 87, 88a, 88b, 88v, 88g, 107, 108, 178b, 178v, 178g");
                        logger.info("226, 243a, 243b, 322, 330, 331a, 331b, 332, 554, 555, 559");
                        break;
                    }
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
