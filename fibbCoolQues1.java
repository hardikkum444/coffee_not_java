// this cool question in java is very cool because of how its built, very cool!
import java.util.*;

public class fibb{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int ans1=0, ans2=0;

        int a = 0, b= 1, c=0;
        boolean ans = false;
        while(c<=num){
            
            c = a+b;
            if(c==num){
                ans = true;
                ans1 = a;
                ans2 = b;
            }

            a = b;
            b = c;
        }

        if(ans){
            System.out.println("addition found --> ("+ans1+","+ans2+")");
        }else{
            System.out.println("addition not found");
        }
    }
}
