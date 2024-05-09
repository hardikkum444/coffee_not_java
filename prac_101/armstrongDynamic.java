// dynamically checking if given number is armstrong or not

import java.util.*;


public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int check = num;
        ArrayList<Integer> mandom = new ArrayList<>();
        
        while(num!=0){
            mandom.add(num%10);
            num=num/10;
        }
        int ans = 0;
        for(int numm : mandom){
            ans+=Math.pow(numm,mandom.size());
        }
        
        if(ans==check){
            System.out.println("Armstrong");
        }else{
            System.out.println("Legstrong");
            
        }
    }
}
