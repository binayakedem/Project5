package question_28;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a Java method to count all words in a string
//Test Data:
//Input the string: The quick brown fox jumps over the lazy dog.
public class WordCounter {
    public static void main(String[] args) {
        String word;
//        input taker class object
        InputOutput in = new InputOutput();
        word = in.stringInputs();
//        word counter object
        MathFunctions mf = new MathFunctions();
        System.out.println(mf.countWords("Number of word=" + word));
    }
}
