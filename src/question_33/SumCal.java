package question_33;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from
//main( ) and print the results.
public class SumCal {
    public static void main(String[] args) {
//        declaration variable
        int num1, num2;

//        object creation
        InputOutput ins = new InputOutput();
        num1 = ins.integerInput();
        num2 = ins.integerInput();

//        sum calculation

        MathFunctions mf = new MathFunctions();
        System.out.println("Total sum of two integers are:" + mf.getTotal(num1, num2));
    }
}
