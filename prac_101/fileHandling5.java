// code which prints only the vowels from a file very imp
import java.util.*;
import java.io.*;

public class explain {

    public static void main(String[] args){
        
        String fileName = "text.txt";
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String word;
            while((word = reader.readLine())!=null){
                boolean isVowel = false;
                for(char lett : word.toCharArray()){
                    for(char ch : arr){
                        if(ch == lett){
                            isVowel = true;
                            break;
                        }
                    }
                }
                if(isVowel){
                    System.out.println(word);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
