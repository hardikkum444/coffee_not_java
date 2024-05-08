// also this is the correct code, better to check just the first character
// code which prints only the vowels from a file very imp
import java.util.*;
import java.io.*;

public class fh2 {

    public static void main(String[] args){

        String fileName = "text.txt";
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        int count = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line=reader.readLine())!=null){
                
                String[] el = line.split("\\s+");
                for(String word : el){
                    for(char check : arr){
                        if(word.charAt(0)==check){
                            System.out.print(word+" ");
                            count+=1;
                            break;
                        }
                    }
                }
                System.out.println();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Total there are "+count+" vowels");
    }
}
