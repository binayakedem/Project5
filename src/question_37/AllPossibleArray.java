package question_37;

import java.util.Scanner;

//A non-empty array A of length n is called an array of all possibilities if it contains all numbers between 0 and A.length-1 inclusive. Write the method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possibilities, otherwise it returns 0.
public class AllPossibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declaring variable
        int[] arr;
        int size;

//        taking size from user
        System.out.println("Enter the size of array:");
        size = sc.nextInt();

//        array initializing

        arr = new int[size];

//        taking input from user

        System.out.println("Enter the array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


//        object creation
        AllPossibleArray obj = new AllPossibleArray();
        System.out.println("The given array is: all possible:" + obj.isAllPossibilities(arr));
    }

    public int isAllPossibilities(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int n = A.length;
        boolean[] found = new boolean[n];

        for (int num : A) {
            if (num < 0 || num >= n) {
                return 0;
            }
            found[num] = true;
        }


        for (boolean isFound : found) {
            if (!isFound) {
                return 0;
            }
        }

        return 1;
    }
}
