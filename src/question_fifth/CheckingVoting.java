package question_fifth;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class CheckingVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        declaration of variable

        int age;

//        taking input from user

        System.out.println("Enter your age:");
        age = scanner.nextInt();

//        creating objec
        CheckingVoting obj = new CheckingVoting();
        obj.checkEligible(age);
    }

    void checkEligible(int age) {
        if (age >= 18) {
            System.out.println("Yes!, you are eligible to vote.");
        } else {

            System.out.println("No!, you are not eligible to vote.");
        }
    }
}
