package question_27;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

import java.util.Random;

//Write a method to generate a random number.
public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println("1. Continue");
        System.out.println("0. Exit");
        InputOutput ins = new InputOutput();
        MathFunctions mf = new MathFunctions();
        int choice = 1;
        while (choice != 0) {
            System.out.println("Random Number is:" + mf.randomNumber());
            System.out.println("Enter your choice below");
            choice = ins.integerInput();
        }
    }
}
