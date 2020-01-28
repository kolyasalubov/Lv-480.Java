//package main.java;

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
//<<<<<<< HEAD
//    public static void main(String[] args) throws IOException {
//        String inputChoise = args[0];
//        int inputValue = Integer.valueOf(args[1]);
//
//        switch (inputChoise) {
//
//            //Huliaka Maksym
//            case ("86a"):
//                System.out.println(Calculator.getDigitQuantity(inputValue));
//                break;
//            case ("86b"):
//                System.out.println(Calculator.getDigitSum(inputValue));
//                break;
//            case ("86c"):
//                System.out.println(Calculator.getPerfectNumbersList(inputValue).toString());
//                break;
//            //Huliaka Maksym
//            case ("88а"):
//                System.out.println(Task.containsThree(inputValue));
//                break;
//            case ("88b"):
//                System.out.println(Task.findReverse(inputValue));
//                break;
//            case ("322"):
//                System.out.println(Task.findSum());
//                break;
//                //Isachenko Dima
//            case (""):
//                break;
//=======
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
                }
            } else {
                flag = false;
            }
//>>>>>>> master
        }
        while (flag);
    }

    private static void printMenu() {
        System.out.println("Options menu:\n"
                + "\tPress <- 1 -> to solve logical tasks.\n"
                + "\tPress <- 2 -> to exit.");
    }
}}

