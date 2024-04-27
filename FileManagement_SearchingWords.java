// program which searches for a word in a file and gives index and line number

import java.io.*;
import java.util.*;

public class temp4{

    public static void main(String[] args){

        String fileName = "text.txt";
        Scanner scan = new Scanner(System.in);
        System.out.print("search word: ");
        String word = scan.next();
        boolean found = false;
        int lineNum = 0;
        int index = 0;
        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine())!=null){
                
                String[] arr = line.split(" ");
                count+=1;
                for(int i = 0;i<arr.length;i++){
                    if(arr[i].equals(word)){
                        found = true;
                        lineNum = count;
                        index = i;
                        break;
                    }
                }
            }
        
        }catch(IOException e){
            System.out.println("File error hahaha!");
        }

        if(found){
            System.out.println("Your word has been found at line number: "+lineNum+" and index: "+index);
        }else{
            System.out.println("Word doesnt exist in the file");
        }
    }
}
