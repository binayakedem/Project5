package question_11;

import math_all_function.MathFunctions;

import java.util.Scanner;

//WAP that displays all the odd numbers from range void displayOddNumbers(int start , int end)
public class OddDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int startPoint, endPoint;

//        taking input from user
        System.out.println("Enter start number:");
        startPoint = sc.nextInt();
        System.out.println("Enter ending number:");
        endPoint = sc.nextInt();

//        creating object of math function
        MathFunctions mf = new MathFunctions();
        mf.displayOddNumber(startPoint, endPoint);
    }
}
