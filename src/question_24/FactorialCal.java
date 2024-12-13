package question_24;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a method to find factorial using recursion.
public class FactorialCal {
    public static void main(String[] args) {

//        variable declaration
        int var;

//        input
        InputOutput ins = new InputOutput();
        var = ins.integerInput();

//        method calling

        MathFunctions mf = new MathFunctions();
        System.out.println("Factorial value is :" + mf.getFactorial(var));
    }
}
