package question_40;

import question_37.AllPossibleArray;

import java.util.Scanner;

// An array is called balanced if it’s even number elements (a[0],a[2],etc.) are even and its odd numbered elements (a[1],a[3],etc.) are odd. Write a function named Balanced that accepts an array of integers and returns 1 if the array is balanced otherwise it returns 0.
public class CheckingBalanceArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        variable declaration
        int []arr;
        int size;

//        taking size from user

        System.out.println("Enter the size of array:");
        size=sc.nextInt();

        arr=new int[size];

//        taking array input from user

        System.out.println("Enter the array values:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

//        object initialization

         CheckingBalanceArray obj=new CheckingBalanceArray();
        System.out.println("is it all possible array:?"+obj.checkBalanceArray(arr));

    }

    public int checkBalanceArray(int a[]){
        int odd=0,even=0, value;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        if(odd==even){
            value=1;
        }else {
            value=0;
        }
        return value;
    }
}
