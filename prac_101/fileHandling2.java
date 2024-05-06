// reversing the sentences

import java.util.*;
import java.io.*;

public class fileHandling1 {

    public static void main(String[] args){

        String fileName = "text.txt";

        ArrayList<String> mandom = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){

                mandom.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        for(int i = mandom.size()-1;i>=0;i--){
            System.out.println(mandom.get(i));
        }
    
    }
}

