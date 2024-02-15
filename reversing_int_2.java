//trying to make a integer reversar using strings

public class reversing_int_2{
    
    public static void main(String[] args){
        
        int num = 437;
        reverser(num);
        
    }

public static void reverser(int n){
    
    String n1 = String.valueOf(n);
    int n2 = Character.getNumericValue(n1.charAt(0));
    int n3 = Character.getNumericValue(n1.charAt(1));
    int n4 = Character.getNumericValue(n1.charAt(2));
    
    int num2 = n4*100;
    int num3 = n3*10;
    
    int ans = num2+num3+n2;
    
    System.out.println("your reversed number is: "+ans);
}   


}

