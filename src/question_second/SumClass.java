package question_second;

import math_all_function.MathFunctions;

//Write a program with a method named getTotal that accepts two integers
// as an argument and return its sum. Call this method from main( )
// and print the results.
public class SumClass {
    public static void main(String[] args) {

//        variable declaration
        int num1 = 90, num2 = 88;

//        creating object of sumclass and math function
        SumClass obj = new SumClass();

        MathFunctions mf = new MathFunctions();

//        calling and recieving the sum data

        System.out.println("Sum of two integer values are:" + mf.getTotal(num1, num2));


    }

}
