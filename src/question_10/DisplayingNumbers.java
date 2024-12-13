package question_10;

import java.util.Scanner;

public class DisplayingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        variable declaraion

        int startPoint, endPoint;

//        taking input from user
        System.out.println("Enter start number:");
        startPoint = sc.nextInt();
        System.out.println("Enter ending number:");
        endPoint = sc.nextInt();


//        creating objec of displaing numbers
        DisplayingNumbers obj = new DisplayingNumbers();
        obj.display(startPoint, endPoint);
    }

    void display(int s, int e) {
        System.out.print("Your numbers are:");
        for (int i = s; i <= e; i++) {
            System.out.println(i);
        }
    }
}
