// cool question demostrating the cool usage of arrayList

import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<String> mandom = new ArrayList<>();
        String[] el = input.split("\\s+");
        
        char[] arr = {'a','e','i','o','u'};
        
        for(String word : el){
            word = word.toLowerCase();
            for(char check : arr){
                if(word.charAt(0)==check){
                    mandom.add(word);
                    break;
                }
            }
        }
        
        String smallest = mandom.get(0);
        
        for(String text : mandom){
            if(smallest.length()>text.length()){
                smallest = text;
            }
        }
        
        System.out.println("Smallest vowel is "+smallest);
    }
}
