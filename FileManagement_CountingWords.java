// really sick program which counts the number of words in a file

import java.util.*;
import java.io.*;

public class temp3{

    public static void main(String[] args){

        String fileName = "text.txt";
        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){
                String[] arr = line.split(" ");
                for(int i = 0;i<arr.length;i++){
                    count+=1;
                }
            }
        }catch(IOException e){
            System.out.println("File doesnt exist");
        }

        System.out.println(count);
    }
}
