//Write a Java program to determine whether a year entered by the user is a leap year or not. A leap year is defined as follows:
//It is divisible by 4, but not divisible by 100, unless it is also divisible by 400.

import java.util.Scanner;

public class IfelseQ{

  public static void main(String[] args){

    System.out.println("Enter the year you'd like to check");
    
    Scanner scan = new Scanner(System.in);

    int year = scan.nextInt();
    scan.close();

    boolean isLeapyear = false;

    if(year%4==0 && year%100!=0 || year%400==0){

      isLeapyear = true;
    }

    if (isLeapyear){

      System.out.println("It is a leap year");
    }
    else{

      System.out.println("It aint a leap year");
    }

  }
}
