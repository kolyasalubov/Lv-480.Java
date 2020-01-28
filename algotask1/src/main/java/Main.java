

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

