package CircleManupulation;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by the user by defining your own method.
public class CicleManupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        varialbe declaration

        float radius;

//        taking the radius of circle

        System.out.println("Ënter the radius of circle:");
        radius = sc.nextFloat();

//        creating of math function object
        MathFunctions obj = new MathFunctions();
        obj.areaOfCircle(radius);
        obj.circumferenceOfCircle(radius);
    }


}
