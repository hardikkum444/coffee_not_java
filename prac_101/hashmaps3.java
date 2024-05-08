// very simple hashmap question

import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("How many employees would you like to add? -> ");
        int size = scan.nextInt();
        scan.nextLine();
        HashMap<Integer, String> mandom = new HashMap<>();
        
        for(int i = 0;i<size;i++){
            System.out.print("Enter employee name -> ");
            String name = scan.nextLine();
            System.out.print("Enter employee ID -> ");
            int id = scan.nextInt();
            scan.nextLine();
            mandom.put(id,name);
        }
        
        System.out.print("Whos id would you like to fetch? -> ");
        String name1 = scan.nextLine();
        
        for(int id : mandom.keySet()){
            if(mandom.get(id).equals(name1)){
                System.out.println(id);
                break;
            }
        }
        
        System.out.println("Displaying all names and id's");
        
        for(int id : mandom.keySet()){
            System.out.println(id+" "+mandom.get(id));
        }
    }
}
