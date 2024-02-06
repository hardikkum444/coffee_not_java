//The usage of parse in java is usually to convert string DT to primitive DT's 
//This code shows the conversion

import java.math.BigInteger;
public class UsingParse{

  public static void main(String[] args){

    String intString = "1234";
    int intValue = Integer.parseInt(intString);
    System.out.println("Parsed integer value: "+intValue);

    String doubleString = "3.14";
    double doubleValue = Double.parseDouble(doubleString);
    System.out.println("Parsed double value: " + doubleValue);
    
    String boolString = "true";
    boolean boolValue = Boolean.parseBoolean(boolString);
    System.out.println("Parsed boolean value: " + boolValue); 
    
    String BigInt = "9383837373";
    BigInteger bigIntValue = new BigInteger(BigInt);
    System.out.println("Parsed BigInteger value: "+bigIntValue);
  }
}
