package question_29;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a Java method to check whether a year (integer) entered by the user
//is a leap year or not
//Expected output:
//Input a year: 2017
//false
public class LeapYearCounter {
    public static void main(String[] args) {
//   variable declaration

        int year;

//        taking input output
        InputOutput ins = new InputOutput();
        System.out.println("Fill year like 2022");
        year = ins.integerInput();

//        calling mathfunction

        MathFunctions mf = new MathFunctions();
        System.out.println("Is " + year + " is leap year?" + mf.isLeapYear(year));
    }
}
