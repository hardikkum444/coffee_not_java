// removing the extra space

import java.util.*;
import java.io.*;

public class fh4{

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line=reader.readLine())!=null){
                
                String[] mandom = line.split("\\s+");
                int count = 0;
                for(String word : mandom){
                    StringBuilder innit = new StringBuilder(word);
                    if(count!=mandom.length-1){
                        System.out.print(innit.reverse()+" ");
                        count++;
                    }else{
                        System.out.print(innit.reverse());
                    }
                }
                System.out.println();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
