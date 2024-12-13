package question_26;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a method to find the area of a circle.
public class AreaOfCicle {
    public static void main(String[] args) {
        float radius;

//        calling input taker
        InputOutput in=new InputOutput();
        radius=in.integerInput();

//        calling calculator

        AreaOfCicle mf=new AreaOfCicle();
         mf.areaOfCircle(radius);
    }
    public void areaOfCircle(float r) {
        System.out.println("Area of circle is :" + Math.PI * r * r);
    }
}
