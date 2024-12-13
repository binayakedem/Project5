package question_12;

import math_all_function.MathFunctions;

import java.util.Scanner;

//WAP that check a prime number boolean checkPrime(int testNumber)
public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        declaration of variable
        int num;

//        taking input from user
        System.out.println("Enter number to checke the prime:");
        num = sc.nextInt();

//        object creation for checking the prime
        MathFunctions mf = new MathFunctions();

        System.out.println("is given number is prime?:" + mf.checkPrime(num));
    }
}
