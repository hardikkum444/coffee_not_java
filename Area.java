//its a sunday and im feeling lazy
//so heres a lame area calc

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
    
        System.out.println("Rectangle area calculator");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your length");
        int l = scan.nextInt();


        System.out.println("Enter your breadth");
        int b = scan.nextInt();

        if(l==b)
        {
            System.out.println("What do you know, its a sqaure");
        }
        else{
            System.out.println("Just a normal rectangle");
        }

        System.out.println("And your area is --> "+(l*b));

        scan.close();
    }
}
