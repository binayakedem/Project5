package question_23;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a method that takes input string from the user and return true if it contains vowels otherwise false.
public class VowelChecker {
    public static void main(String[] args) {

//        declaration of variable
        String txt;

//        taking input
        InputOutput ins = new InputOutput();
        txt = ins.stringInputs();

//        math function
        MathFunctions mf = new MathFunctions();
        System.out.println("Is contains vowel?:" + mf.vowelChecker(txt));

    }
}
