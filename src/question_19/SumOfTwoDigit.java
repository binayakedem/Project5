package question_19;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by users defining your own method.
public class SumOfTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int num1, num2;

//        taking input from user
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

//        creating object of math function

        MathFunctions mf=new MathFunctions();
        System.out.println("Sum of two digits is:"+mf.getTotal(num1,num2));
    }
}
