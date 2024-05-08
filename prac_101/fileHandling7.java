// to remove all punctuation from file text
import java.util.*;
import java.io.*;

public class fh3{

    public static void main(String[] args){

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){

                line =line.replaceAll("[\\s,!?/,]","");
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
