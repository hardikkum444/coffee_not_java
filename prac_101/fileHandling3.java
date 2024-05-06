// reversing every word of every line
import java.util.*;
import java.io.*;

public class fileHandling1 {

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){
                StringBuilder ans = new StringBuilder(line);
                System.out.println(ans.reverse());
        }

        }catch(IOException e){
            e.printStackTrace();
        }
    
    }
}

