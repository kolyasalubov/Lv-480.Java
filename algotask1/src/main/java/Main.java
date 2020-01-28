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

