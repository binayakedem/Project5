package question_34;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

public class SwapingNumbers {
    public static void main(String[] args) {
//        declaring varibale

        int num1 , num2;

//        taking input from user
        InputOutput ins=new InputOutput();

        num1=ins.integerInput();
        num2= ins.integerInput();

//        displaying result
        System.out.println("Before swaping integers:");
        System.out.println("This is first number:"+num1);
        System.out.println("This is second number:"+num2);
        System.out.println("After swapping swaping integers:");

        MathFunctions mf=new MathFunctions();
        mf.swappingNumbers(num1,num2);
    }
}
