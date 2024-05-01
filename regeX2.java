// using regex to print only vowels, a little new, i would say :|

import java.util.*;
import java.io.*;
import java.util.regex.*;

public class regex2 {

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            Pattern pattern = Pattern.compile("[aeiouAEIOU]");
            StringBuilder bd = new StringBuilder();

            while((line = reader.readLine())!=null){

                Matcher matcher = pattern.matcher(line);
                
                while(matcher.find()){

                    bd.append(matcher.group());
                }
            }

            System.out.println(bd.toString());


        }catch(IOException e){

            e.printStackTrace();
        }
    }
}
