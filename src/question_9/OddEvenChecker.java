package question_9;

import math_all_function.MathFunctions;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int num1;


//        taking input from user
        System.out.println("Enter  number to check odd or even:");
        num1 = sc.nextInt();

//        creating objce of mathfunction

        MathFunctions mf = new MathFunctions();

//        displaying out put to user

        System.out.println("The give number is even:" + mf.isEven(num1));

    }
}
