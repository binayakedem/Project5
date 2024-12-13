package question_20;

import java.util.Scanner;

//Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
public class GradingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declaration of variable

        int num;

//        taking input from user
        System.out.println("Enter your marks ranging from 0-100:");
        num = sc.nextInt();
        GradingSystem obj = new GradingSystem();
        obj.displayGrade(num);
    }

    void displayGrade(int num) {
        if (num > 90 && num <= 100) {
            System.out.println("Your grade is AA");
        } else if (num > 80 && num <= 90) {
            System.out.println("Your grade is AB");

        } else if (num > 70 && num <= 80) {
            System.out.println("Your grade is BB");

        } else if (num > 60 && num <= 70) {
            System.out.println("Your grade is BC");

        } else if (num > 50 && num <= 60) {
            System.out.println("Your grade is CD");

        } else if (num > 40 && num <= 50) {
            System.out.println("Your grade is DD");

        } else if (num >= 0 && num <= 40) {
            System.out.println("Your grade is AB");

        } else {
            System.out.println("You must enter 0-100 marks please");
        }
    }
}
