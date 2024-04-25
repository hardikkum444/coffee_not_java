// Write a Java program that demonstrates the use of a custom exception named InvalidAgeException. The program should prompt the user to enter their age. If the age entered is less than 0 or greater than 120, it should throw an InvalidAgeException. Handle this exception by displaying an error message to the user.

import java.util.*;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message){

        super(message);
    }
}

public class prac5 {

    public static void check(int age) throws InvalidAgeException{

        if(age>120 || age<0){
            throw new InvalidAgeException("Error: your age is invalid!");
        }else{

            System.out.println("Entered age is correct, good to go!");
        }
    }

    public static void main(String[] args){

        System.out.print("What's your age? ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        try{
            
            check(age);
        
        }catch(InvalidAgeException e){
                
            System.out.println(e.getMessage());
        }
    }
}
