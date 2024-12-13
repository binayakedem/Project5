package question_36;

import input_taker_and_return.InputOutput;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        variable declaration
        int num;

//        taking input form user

        InputOutput ins = new InputOutput();
        num = ins.integerInput();


//        creating object

        ArmstrongNumber obj = new ArmstrongNumber();
        System.out.println("Is "+num+" palindrome?"+obj.isArmstrong(num));
    }


    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }


        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return sum == originalNumber;
    }
}