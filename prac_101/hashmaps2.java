// using hashmap to store the frequency of words in a sentence

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        HashMap<String, Integer> mandom = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] el = input.split(" ");
        
        for(String name : el){
            
            if(mandom.containsKey(name)){
                mandom.put(name, mandom.get(name)+1);
            }else{
                mandom.put(name, 1);
            }
        }
        
        for(String name : mandom.keySet()){
            System.out.println(name+" : "+mandom.get(name));
        }
        
        
    }
}
