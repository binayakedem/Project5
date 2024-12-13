package math_all_function;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;

public class MathFunctions {
   public int getTotal(int n1, int n2) {
        return n1 + n2;
    }


    public int multiTwoDigit(int n1,int n2){
       return n1*n2;
    }

    public int divisionTwoDigit(int n1, int n2){
       return n1/n2;
    }


    public int getFactorial(int num){
       if (num==1 || num==0){
           return 1;
       }
       return num*getFactorial(num-1);
    }

    public int sumOfThreeDigit(int n1, int n2, int n3){
       return n1+n2+n3;
    }

    public boolean isEven(int num){
       if(num%2==0){
           return true;
       }else {
           return false;
       }
    }

    public void displayOddNumber(int start, int end){
        System.out.println("Odd numbers are:");
       for (int i=start;i<=end;i++){
           if(i%2!=0){
               System.out.println(i);
           }
       }
    }

    public boolean checkPrime(int num){
       boolean flag=true;
       for(int i=2;i<num;i++){
           if(num%i==0){
               flag=false;
               break;
           }
       }
       return flag;
    }

    public void checkPrimeLarge(){
        System.out.println("All the prime numbers:");
        for(int i=2;i<=1000;i++){
        boolean flag=true;
            int temp=i;
        for(int j=2;j<temp;j++){
            if(temp%j==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println(i);
        }
        }
    }

    public void printMultiplication(int num){
        System.out.println("Multiplicaton table of:"+num +" is given below");
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+i+"="+(num*i));
        }
    }

//    calculating largest number:
public void highestNumber(int n1, int n2, int n3) {
    if (n1 > n2 && n1 > n3) {
        System.out.println(n1 + " is the highest number");
    } else if (n2 > n1 && n2 > n3) {
        System.out.println(n2 + " is the highest number");
    } else {
        System.out.println(n3 + " is the highest number");
    }}
// this is for lowest value
public void lowestNumber(int n1, int n2, int n3){
        if(n1<n2 && n1<n3){
            System.out.println(n1+" is the lowest number");
        } else if (n2<n1 && n2<n3) {
            System.out.println(n2 +" is the lowest number");
        }else {
            System.out.println(n3+ " is the lowest number");
        }

    }


//    checking the parameter equality


    public boolean isEquals(int num1, int num2) {
        if(num1==num2){
            return true;
        }else {
            return false;
        }
    }

//    calculate teh length of number:
    public int lenghtCounter(int num){
       int len=0;
       while(true){
           num=num/10;
           len++;
           if(num==0){
               break;
           }
       }
       return len;
    }

//    word counter in string

    public  int countWords(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

   public void areaOfCircle(float r) {
        System.out.println("Area of circle is :" + Math.PI * r * r);
    }

    public  void circumferenceOfCircle(float r) {
        System.out.println("Circumference of circle is :" + 2 * Math.PI * r);
    }

    public boolean vowelChecker(String str){
       boolean flag=false;
       for(int i=0;i<str.length();i++){
           char var;
           var=str.charAt(i);
           if(var=='a'|| var=='e' || var=='i' || var=='o' || var=='u'){
               flag=true;
               break;
           }
       }
       return flag;
    }

//    vowel counter
public int vowelCounter(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
        char var;
        var=str.charAt(i);
        if(var=='a'|| var=='e' || var=='i' || var=='o' || var=='u'){
            count++;
        }
    }
    return count;
}


//area of triangle
    public double areaOfTriangle(float f1, float f2, float f3){
        float s = (f1+f2+f3) / 2;
        return Math.sqrt(s * (s - f1) * (s - f2) * (s - f3));
    }

//    GCD calculation
    public int gcdCal(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcdCal(b, a % b);
    }

//    random number generator
    public  int randomNumber(){
        Random rand=new Random();
        return rand.nextInt(100);
    }
    public void currentDate(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }

//    calculation the sum of series
//    Write a program in java to find the sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5 using the function.

    public int sumOfSeries(){
       int result=0;
       for(int i=1;i<=5;i++){
           int temp=getFactorial(i);
           int temp2=temp/i;

           result=result+temp2;
       }
       return result;
    }

    public void swappingNumbers(int num1, int num2){
       int temp;
       temp=num1;
       num1=num2;
       num2=temp;
        System.out.println("This is first number:"+num1);
        System.out.println("This is second number:"+num2);
    }

//    password checker
//    A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.

    public boolean passwordChecker(String str){
       boolean flag=true;
       int count=0;
       if(str.length()<10){
           flag=false;
       }
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(Character.isDigit(ch)){
               count++;
           }
           if(!Character.isLetterOrDigit(ch)){
               flag=false;
           }
       }
       if(count<2){
           flag=false;
       }
       return flag;
    }


//    leap function calculator
    public boolean isLeapYear(int yr){
       boolean flag=false;
        if (yr % 4 == 0) {

            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    flag = true;
                }
            } else {
                flag = true;
            }
        }

        return flag;
    }

//    checking the palindrome number
    public boolean isPalindrome(int number){
     if (number < 0) {
        return false;
    }

    int originalNumber = number;
    int reversedNumber = 0;

    // Reverse the number
        while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

        return originalNumber == reversedNumber;
}



//anagram checker

    public boolean anagramChecker(String str1, String str2){
       boolean flag=false;
       str1=str1.toLowerCase();
       str2=str2.toLowerCase();
        System.out.println(str1);
        if(str2.length()!=str1.length()){
            flag=false;
        }else {
            for (int i = 0; i < str1.length();i++){
                for(int j=i;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        flag=true;
                    }
                }
            }

        }

       return flag;
    }
    }
