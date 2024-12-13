package question_41;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Create a simple java method to read  integers from users and manipulate that data(like addition).
public class IntegerManupulation {
    public static void main(String[] args) {

//        variable declaration
        int num1, num2;

//        creating object for input
        InputOutput ins = new InputOutput();
        num1 = ins.integerInput();
        num2 = ins.integerInput();

//        manupulation of string

        MathFunctions mf = new MathFunctions();
        System.out.println("Multiplication value si:" + mf.multiTwoDigit(num1, num2));

        System.out.println("Addition of two value is:" + mf.getTotal(num1, num2));

        System.out.println("Division vo two numbers is:" + mf.divisionTwoDigit(num1, num2));
    }
}
