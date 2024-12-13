package question_16;

import math_all_function.MathFunctions;

import java.util.Scanner;

//Write a java program to count all the words of a string . Example : I want to be a software engineer. Output : 7
public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        MathFunctions mf = new MathFunctions();
        // Counting the words
        int wordCount = mf.countWords(input);

        // Displaying the output
        System.out.println("The number of words in the string is: " + wordCount);
    }
}
