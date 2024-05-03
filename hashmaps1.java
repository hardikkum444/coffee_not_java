//counting freq using hashmaps wierd
import java.util.*;

public class CharCountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char charToAdd = Character.isUpperCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                charCountMap.put(charToAdd, charCountMap.getOrDefault(charToAdd, 0) + 1);
            }
        }

        System.out.println(charCountMap);

        scanner.close();
    }
}
