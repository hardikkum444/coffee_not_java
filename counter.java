//basic letter counting algorithm, with a new concept

import java.util.Scanner;

public class counter {
    
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter how many words in you're name");
    
    int ch = scan.nextInt();
    scan.nextLine();
    
    System.out.println("Enter youre name");
    String name = scan.nextLine();
    
    int[] arr = new int[ch]; 
    int ans =0;   

    for(int i=0;i<ch;i++)
    {
        arr[i] = name.charAt(i);     //something new!!!!
        if(arr[i] == 'a' || arr[i] == 'A')
        {
            ans++;
        }
    }

    System.out.println("You're name has "+ans+" a's int it");


    

    
    //int[] arr = new int[3];
    scan.close();

    }

}
