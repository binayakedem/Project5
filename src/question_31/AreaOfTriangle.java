package question_31;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write Java methods to calculate the area of a triangle.
//Expected Output:
//Input Side-1: 10
//Input Side-2: 15
//Input Side-3: 20
//The area of the triangle is 72.6184377413890
public class AreaOfTriangle {
    public static void main(String[] args) {
//        declaring variable

        float firstSide,secondSide,thirdSide;

//        taking input form user

        InputOutput ins=new InputOutput();
        firstSide=ins.floatInput();
        secondSide=ins.floatInput();
        thirdSide=ins.floatInput();

//        calculating the area of triangle

        MathFunctions mf=new MathFunctions();
        System.out.println("Area of triangle is:"+mf.areaOfTriangle(firstSide,secondSide,thirdSide));
    }
}
