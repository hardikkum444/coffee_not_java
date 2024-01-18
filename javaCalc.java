//simple calc using java's basic concepts 

import java.util.Scanner;

public class javaCalc {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to calculator: ");
        
        System.out.println("What would you like us to perform?");
        boolean rep = false;
        
        while (rep==false){
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");

        int choice = scan.nextInt();

        
        System.out.println("Enter youre first number");
        int first = scan.nextInt();
        System.out.println("Enter youre second number");
        int second = scan.nextInt();

        if(choice == 1 || choice == 2 || choice ==3 || choice == 4)
        {   
            rep = true;

            if (choice == 1)
            {
                System.out.println("adding gives "+(first+second));
            }
    
            else if (choice == 2)
            {
                System.out.println("subtracting gives "+(first-second));
            }
            else if (choice == 3)
            {
                System.out.println("multiplying gives "+(first*second));
            }
            else
            {
                System.out.println("dividing gives "+(first/second));
            }
        }
        else{
            System.out.println("INVALID RESPONSE");
            rep = false;
        }

    }


    }
    
}
