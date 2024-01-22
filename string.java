//demonstarting the use of strings in java

import java.util.Scanner;

public class string {
    
    public static void main(String[] args){

        //we can use string like we used Scanner in java (previously)
        
        String name = new String("Hardik");
        
        //but java has given us a special support for Strings and hence we can also use it in the following way

        String name2 = "Quagmire";

        System.out.println(name);
        System.out.println(name2);


        //also println prints the statement and then breaks the line to get onto new line
        //you can use only print to stay on that line

        //using printf
        //you can also use printf just like we used to in C

        int a = 12;
        float b = 4.565f; //remeber to put an f

        System.out.printf("and your answers are %d and %.2f respectively",a,b);

        //same kind of behaviour is shown my format
        //but these methods dont leave a space between all the lines

        System.out.format("and your answers are %d and %.1f respectively",a,b);

        System.out.println();

        //cool scanner thing 
        
        Scanner scan = new Scanner(System.in);
        String thing = scan.nextLine();

        System.out.println(thing);

        scan.close();

    
    }

}
