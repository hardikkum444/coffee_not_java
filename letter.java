//a very simple character receder

import java.util.Scanner;

class letter{
    public static void main(String[] args) {
        
        System.out.println("Enter a letter");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        
        char input = scan.next().charAt(0);
        
        if(input == 'A')
        {
            System.out.println("Z");
        }
        else if (input == 'Z')
        {
            System.out.println("A");
        }
        else
        {
        char out = (char) (input-1);
        System.out.println(out);
        }
        //System.out.println(out);
    }
}