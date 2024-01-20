//very basic login code, using the most simplest of java

import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do today?");
        System.out.println();
        System.out.println("Press 1 for account creation");
        System.out.println("Press 2 for viewing info");
        int ch = scan.nextInt();
        scan.nextLine();

        if (ch == 1) {
            System.out.println("Enter your name: ");
            String name = scan.nextLine();

            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            scan.nextLine();

            System.out.println("Work: ");
            String company = scan.nextLine();

            System.out.println("id: ");
            int id = scan.nextInt();

            System.out.println("Account created successfully for " + name + " with age " + age);


            System.out.println("Would you like to view before submitting?( 1 for yes, 2 for no)");
            int ch1 = scan.nextInt();

            if(ch1==1)
            {
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Work: "+company);
                System.out.println("ID: "+id);
            }
            else
            {
            }
            
        } else if (ch == 2) {

            System.out.println("Lovely professional university");
            System.out.println("Phagwara");
            System.out.println("Punjab");
        } else {
            System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}
