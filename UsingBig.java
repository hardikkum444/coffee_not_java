import java.math.BigInteger;

public class UsingBig{

  public static void main(String[] args){

   BigInteger a = BigInteger.valueOf(4);  //converting int/long to BigInteger
   BigInteger b = BigInteger.valueOf(1);
   System.out.println(a);

   System.out.println("and the addition gives you: "+a.add(b));
   
   int c = b.intValue();   //converting BigInteger to int 
   

   BigInteger e = a.multiply(b);

   System.out.println("and the multiplication is: "+e);
   System.out.println("and the subtraction is: "+a.subtract(b));
   System.out.println("and the division is: "+a.divide(b)); 
  }
} 
