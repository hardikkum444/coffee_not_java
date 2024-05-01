// better way of approaching!!

import java.io.*;
import java.util.*;

public class regex3{

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;

            while((line = reader.readLine())!=null){

                String ans = line.replaceAll("[^aeiouAEIOU]","");

                System.out.println(ans);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
