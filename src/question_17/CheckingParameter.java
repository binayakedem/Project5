package question_17;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Create a function that returns true when both the parameters are equal else return false. isSameNum(4, 8) ➞ false
public class CheckingParameter {

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
        MathFunctions mf = new MathFunctions();

        System.out.println("Is it both are equal:"+mf.isEquals(num1,num2));
    }
}
