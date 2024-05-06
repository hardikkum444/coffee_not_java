// reversing every single word and not the entire sentence

import java.util.*;
import java.io.*;

public class fileHandling1 {

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){

                String[] el = line.split(" ");
                for(String words : el){
                    StringBuilder ans = new StringBuilder(words).reverse();
                    System.out.print(ans+" ");
                }
                System.out.println();
        }

        }catch(IOException e){
            e.printStackTrace();
        }
    
    }
}

