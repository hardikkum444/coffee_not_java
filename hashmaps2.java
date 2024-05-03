//printing key and value from hashmap in a particular manner
import java.util.*;

public class IterateHashMap {
    public static void main(String[] args) {
        Map<String, String> argMap = new HashMap<>();

        for (String arg : args) {
            argMap.put(arg.substring(0, 3), arg);
        }

        argMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
