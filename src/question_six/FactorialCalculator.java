package question_six;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method getFactorial(int number).
public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration

        int num;

//        taking input from user
        System.out.println("Enter the value to calculate the factorial");
        num = sc.nextInt();

//        creating object of math function

        MathFunctions mf = new MathFunctions();
        System.out.println("Factorial value is :" + mf.getFactorial(num));
    }
}
