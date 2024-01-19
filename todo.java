

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
            System.out.print("Enter your " + (num + 1) + "th task --> ");
            
            String tsk = scan.nextLine();
            array[num++] = tsk;

            System.out.println("");
            choice--;
        }

        System.out.println("");
        System.out.println("So these are you're daily tasks");
        int n = 0;

        while(n!=choice+1)
        {
            System.out.println(n+": "+array[n++]);
            System.out.println("");
        }

        
    
        scan.close();


    }
}

// import java.util.Scanner;

// public class todo {

//     public static void main(String[] args) {
        
//         Scanner scan = new Scanner(System.in);
        
//         System.out.print("How many tasks would you like to complete today? ");
//         int choice = scan.nextInt();
//         scan.nextLine(); // Consume the newline character
        
//         String[] array = new String[choice];
//         int num = 0;
        
//         while(choice != 0)
//         {
//             System.out.print("Enter your " + (num + 1) + "th task --> ");
            
//             String tsk = scan.nextLine();
//             array[num++] = tsk;

//             System.out.println("");
//             choice--;
//         }

//         System.out.println("\nSo these are your daily tasks:");
//         int n = 0;

//         while (n != num) {
//             System.out.println(n + ": " + array[n++]);
//             System.out.println("");
//         }

//         scan.close();
//     }
// }
