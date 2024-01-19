

import java.util.Scanner;

public class todo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("how many tasks would you like to complete today? ");
        int choice = scan.nextInt();
        
        String[] array = new String[choice];
        int num = 0;
        
        while(choice!=0)
        {
            System.out.println("Enter you're "+choice+"th task -->");
            
            String tsk = scan.nextLine();
            array[num++] = tsk;

            System.out.println("");
            choice--;
        }

        System.out.println("");
        System.out.println("So these are you're daily tasks");
        int n = 1;

        while(n!=choice+1)
        {
            System.out.println(n+": "+array[n--]);
            System.out.println("");
        }

        
        
        
        String name = scan.nextLine();
        
        System.out.println("So youre name is: "+name);



    }
}