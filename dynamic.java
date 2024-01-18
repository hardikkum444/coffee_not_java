//java code which takes dynamic input from user


import java.util.Scanner;

public class dynamic{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("enter youre number of choice: ");
        int usrinput = scan.nextInt();

        System.out.println("the number you have entered is: " + usrinput);

        scan.close();

    }
}