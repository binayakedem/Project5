package question_18;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Define two methods to print the maximum and minimum number respectively among three numbers entered by the user.
public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int num1, num2, num3;

//        taking input from user
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Enter third number:");
        num3 = sc.nextInt();

//        creating object of math function
        MathFunctions mf = new MathFunctions();
        mf.lowestNumber(num1, num2, num3);
        mf.highestNumber(num1, num2, num3);
    }
}
