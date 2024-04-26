// basic usage of a hashmap
import java.util.*;

public class prac8 {
    
    public static void main(String[] args){

        HashMap<String, String> thing = new HashMap<String, String>();

        // adding values to our hashmaps
        thing.put("Country", "India");
        thing.put("Nationality", "Indian");
        thing.put("MotherTongue", "Hindi");
        thing.put("Name", "BigShaq");

        //now printing them out 
        System.out.println("Whats your name: "+thing.get("Name"));
        System.out.println("Where do you live: "+thing.get("Country"));
        System.out.println("Whats your Mother Tongue: "+thing.get("MotherTongue"));
        System.out.println("Whats your nationality: "+thing.get("Nationality"));
    }
}
