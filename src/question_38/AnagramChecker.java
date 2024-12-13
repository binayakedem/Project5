package question_38;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

// checking anagram;
public class AnagramChecker {
    public static void main(String[] args) {
//        declaration of variable

        String str1, str2;

//        taking input
        InputOutput ins=new InputOutput();
        str1=ins.stringInputs();
        str2=ins.stringInputs();

//        calling method
        MathFunctions mf=new MathFunctions();
        System.out.println("String:"+str1 +" and String :"+str2 +"is anamgram?" +mf.anagramChecker(str1,str2));
    }
}
