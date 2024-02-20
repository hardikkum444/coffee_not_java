import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("till what number would you like to print");
        
        int n1 = scan.nextInt();
        
        System.out.print("2 ");
        
        for(int i=3;i<=n1;i++){
            
            boolean isPrime = true;
            
            for(int j=2;j<=i/2;j++){
                
                if(i%j==0){
                    isPrime = false;
                }
            }
            
            if(isPrime){
                
                System.out.print(i+" ");
            }
                
        }
        
        
    }
}

//*23