// Online Java Compiler
import java.util.*;

// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        
        int n1 = scan.nextInt();
        
        for(int i =1;i<=n1;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
