package question_25;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//write a method to find gcd using recursion.
public class GCDCal {
    public static void main(String[] args) {

//        variable declaration
        int a, b;

//        taking input
        InputOutput ins=new InputOutput();
        a=ins.integerInput();
        b=ins.integerInput();

//        gcd calculation
        MathFunctions mf=new MathFunctions();

//        displaying the result

        System.out.println("GCD value of "+ a+ " and "+b +" is ="+mf.gcdCal(a,b));
    }
}
