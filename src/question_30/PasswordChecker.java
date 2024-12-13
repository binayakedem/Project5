package question_30;

import input_taker_and_return.InputOutput;
import math_all_function.MathFunctions;

//Write a Java method to check whether a string is a valid password
//Password rules:
//A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
//
//Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
//Password is valid: abcd1234
public class PasswordChecker {
    public static void main(String[] args) {

//        declare variable
        String password;
        boolean flag;

//        taking input from user
        InputOutput ins = new InputOutput();

        password = ins.stringInputs();

//        calling math function

        MathFunctions mf=new MathFunctions();

        flag=mf.passwordChecker(password);
        if(flag==false){
            System.out.println("Please select the strong password");
        }else {
            System.out.println("You are great! you choose strong password "+password);
        }

    }
}
