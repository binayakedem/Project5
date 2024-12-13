package question_8;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Create a function called sum(int num1 , int num2 , int num3)  and inside the function return the sum of three numbers and display it in the part from where the function was called.
public class SumOfThree {
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

//        displaying the output

        System.out.println("Sum of three digits are:" + mf.sumOfThreeDigit(num1, num2, num3));


    }
}
