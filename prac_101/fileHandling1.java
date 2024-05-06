// finding the number of times a word has repeated in a file

import java.io.*;
import java.util.*;

public class fileHandling1 {

    public static void main(String[] args){

        String fileName = "text.txt";

        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine())!=null){
                if(line.contains("num")){
                    count+=1;
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Number of times num has repeated "+count);
    }
}
