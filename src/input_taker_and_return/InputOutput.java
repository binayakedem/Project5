package input_taker_and_return;

import java.util.Scanner;

// this class is created for input and output
public class InputOutput {
    public String stringInputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String value:");
        String str=sc.nextLine();
        return str;
    }
    public int integerInput(){
        Scanner sc=new Scanner(System.in);
        int num1;
        System.out.println("Enter integer value:");
        num1=sc.nextInt();
        return num1;
    }
    public float floatInput(){
        Scanner sc=new Scanner(System.in);
        float num1;
        System.out.println("Enter float value:");
        num1=sc.nextFloat();
        return num1;
    }

}
