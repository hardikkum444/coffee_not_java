// method one of finding byte size of file

import java.util.*;
import java.io.*;

public class fh5{

    public static void main(String[] args){

        String fileName = "text.txt";

        File file = new File(fileName);

        System.out.println(file.length());
    }
}
import java.io.*;
import java.util.*;
import java.nio.file.*;

//method 2 of finding byte size of file

public class fh6{

    public static void main(String[] args){

        File file = new File("text.txt");

        try{
            byte[] read = Files.readAllBytes(file.toPath());
            int length = read.length;
            System.out.println(length);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
