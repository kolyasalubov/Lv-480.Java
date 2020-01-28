<<<<<<< HEAD
=======

>>>>>>> d806a9f8b79f5b256c8d0d332d98d5244f5712f9


import borovets.mykola.CheckFirstCondition;
import borovets.mykola.checkSecondCondition;
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


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        int temp;
        do {
            printMenu();
            temp = Integer.parseInt(reader.readLine());
            if (temp == 1) {
                System.out.println("Enter number of your task:");
                String inputChoice = reader.readLine();
                switch (inputChoice) {

                    //Roman Blavatskyi
                    case ("178b"):
                        System.out.println("Amount of sequence members "
                                + "by multiples of 3 and not multiples of 5: "
                                + FirstTask.getAmountOfMultiples());
                        break;
                    case ("178c"):
                        System.out.println("Amount of sequence members "
                                + "that are squares of even numbers: "
                                + SecondTask.getAmountSquaresOfEvenNumbers());
                        break;
                    case ("554"):
                        ThirdTask.getAllPythagoreanTriplesOfNumber();
                        break;
                    //Roman Blavatskyi
<<<<<<< HEAD

                    //Mykola Borovets
                    case ("178e"):
                        System.out.println("Amount of sequence members "
                                + "by multiples of 3 and not multiples of 5: "
                                + CheckFirstCondition.getAmountSquaresOfEvenNumbers1());
                        break;
                    case ("178d"):
                        System.out.println("Amount of sequence members "
                                + "by multiples of 3 and not multiples of 5: "
                                + checkSecondCondition.getAmountSquaresOfEvenNumbers1());
                        break;
                    //Mykola Borovets
=======
                    //Maksym Huliaka
                    case ("86a"):
                        System.out.println("Number to calculate digit quantity");
                        int inputValue = Integer.parseInt(reader.readLine());
                        System.out.println(Calculator.getDigitQuantity(inputValue));
                        break;
                    case ("86b"):
                        System.out.println("Number to calculate digit sum");
                        int inputValue2 = Integer.parseInt(reader.readLine());
                        System.out.println(Calculator.getDigitSum(inputValue2));
                        break;
                    case ("330"):
                        System.out.println("perfect numbers that lower than number:");
                        int inputValue3 = Integer.parseInt(reader.readLine());
                        System.out.println(Calculator.getPerfectNumbersList(inputValue3).toString());
                        break;
                    //Maksym Huliaka
                    //Borys Latyk
                    case ("88в"):
                        System.out.println("Swap the first and the last digit "
                                + Algorythm.swapDigits());
                        break;
                    case ("88г"):
                        System.out.println("Add digit 1 to the beginning end to the end of number"
                                + Algorythm.addDigits());
                        break;
                    case ("332"):
                        System.out.println("Lagrange theorem " +
                        Algorythm.checkTheorem());
                        break;
                    //Borys Latyk

                    //Puiko Vadym
                    case ("108"):
                        System.out.println("Дано натуральне число n. Отримати найменше число 2^r, яке перевищює n."
                                + "\n" + "Enter n: ");
                        System.out.println(MathOperation.getSmallestNumber(Integer.parseInt(reader.readLine())));
                        break;
                    case ("331a"):
                        System.out.println("Дано натуральне число n. Можливо представити його у виді суми трьох квадратів натуальних чисел. " +
                                "\n" + "Якщо можна, то вказати трійку x, y, z таких натуральних чисел," +
                                "що n = x^2 + y^2 + z^2" + "\n" + "Enter n: ");
                        MathOperation.getSumOfThreeSquaresA(Integer.parseInt(reader.readLine())).forEach(System.out::println);
                        break;
                    case ("331b"):
                        System.out.println("Дано натуральне число n. Можливо представити його у виді суми трьох квадратів натуальних чисел. " +
                                "\n" + "Якщо можна, то вказати всю трійку x, y, z таких натуральних чисел," +
                                "що n = x^2 + y^2 + z^2" + "\n" + "Enter n: ");
                        System.out.println(MathOperation.getSumOfThreeSquaresB(Integer.parseInt(reader.readLine())));
                        break;
                    //Puiko Vadym

>>>>>>> d806a9f8b79f5b256c8d0d332d98d5244f5712f9
                }
            } else {
                flag = false;
            }
        }
        while (flag);
    }

    private static void printMenu() {
        System.out.println("Options menu:\n"
                + "\tPress <- 1 -> to solve logical tasks.\n"
                + "\tPress <- 2 -> to exit.");
    }
}
