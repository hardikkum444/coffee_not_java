// using regex to avoid printing spaces

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class regex1{

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            
            while((line = reader.readLine())!=null){

                String ans = line.replaceAll("\\s","");

                System.out.println(ans);
            }
        }catch(IOException e){
            
            e.printStackTrace();
        }
    }
}
