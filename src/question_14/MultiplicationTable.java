package question_14;

import math_all_function.MathFunctions;

import java.util.Scanner;

//WAP to print the multiplication table of a number using a function printMultiplication(int inputNumber)
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        declaration of variable

        int num;

//        taking input form user
        System.out.println("Enter the value to calculate multiplication table:");
        num = sc.nextInt();

        MathFunctions mf = new MathFunctions();

//        method calling
        mf.printMultiplication(num);
    }
}
