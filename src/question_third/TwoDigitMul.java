package question_third;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by the user.
public class TwoDigitMul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        declaration of variable
        int num1, num2;

//        taking input from user
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

//        creating object of math function

        MathFunctions mf = new MathFunctions();

//        printing result to user

        System.out.println("Multiplication of two values are:" + mf.multiTwoDigit(num1, num2));


    }
}
