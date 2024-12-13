package question_22;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false. In main() method accept a string from the user and count the number of vowels in that string.
public class VowelCounter {
    public static void main(String[] args) {
//        variable declaration
        String txt;

//        taking input from user
        InputOutput ins = new InputOutput();
        txt = ins.stringInputs();

//        counting the number of vowels:
        MathFunctions mf = new MathFunctions();

        System.out.println("Total number of vowels:" + mf.vowelCounter(txt));
    }

}
