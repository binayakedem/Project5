package question_15;

import math_all_function.MathFunctions;

import java.util.Scanner;

//WAP a java program that takes a number and returns the length of the number.
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int num1;

//        taking input from user
        System.out.println("Enter first number:");
        num1 = sc.nextInt();

//        creating object of math funtion

        MathFunctions mf=new MathFunctions();
        System.out.println("Total length of number is:"+mf.lenghtCounter(num1));
    }
}
