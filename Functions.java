//future time machine code which will demonstrate the usage of functions in java

import java.util.Scanner;

public class Functions {

    public static int Finding(int a, int b)
    {
        int fina = a+b;
        return fina;
    }
    
    
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");

        int a = scan.nextInt();

        System.out.println("How many years into the future?");

        int b = scan.nextInt();


        System.out.println("Your age after the next "+b+"years into the future will be --> "+Finding(a,b));
        scan.close();
    
    }

    
    
}   
