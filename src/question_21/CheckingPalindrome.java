package question_21;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a method that takes as input a nonnegative integer and
//returns true if the number is a palindrome; otherwise, it returns
//false. Also write a program to test your method.
public class CheckingPalindrome {
    public static void main(String[] args) {

//        declaration of variables
        int number;

//        taking input from user
        InputOutput ins=new InputOutput();
        number=ins.integerInput();

//        manupulation and displaying the result
        MathFunctions mf=new MathFunctions();
        System.out.println(number+" is palindrome?"+mf.isPalindrome(number));

    }
}
