package question_seven;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Create a function called averageNumber(int num1 , int num2 , int num3)  and inside the function display the highest and lowest among three numbers.
public class HighestLowest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        variable declaraion

        int num1,num2,num3;

//        taking input from user
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();
        System.out.println("Enter third number:");
        num3=sc.nextInt();

//        creating object of math function

        MathFunctions mf=new MathFunctions();
        mf.highestNumber(num1,num2,num3);
        mf.lowestNumber(num1,num2,num3);
    }

    }

