package question_42;

import input_taker_and_return.InputOutput;

//reate a simple java method to read  String from users and manipulate that data(like concatenatio
public class StringManupulation {
    public static void main(String[] args) {
//        declaring variables

        String str1, str2,temp;

//        taking input from user
        InputOutput ins=new InputOutput();
        str1=ins.stringInputs();
        str2=ins.stringInputs();


//        displaying the result
        System.out.println("This is first string:"+str1);
        System.out.println("This is second string:"+str2);

//        exchanging string1 and string2
        System.out.println("Exchanging first and second string as:");
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("This is first string:"+str1);
        System.out.println("This is second string:"+str2);

//        concatinate the string of both
        System.out.println("Concatination using + operator");
        System.out.println(str1+str2);

//        another way is using concate()
        System.out.println("This is concate using concate() method:");
        System.out.println(str1.concat(str2));

//        exchanging string onw and string two


    }
}
