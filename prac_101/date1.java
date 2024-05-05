// taking basic date input in java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] el = scan.nextLine().split("\\."); 
        int ans = Integer.parseInt(el[0])+1;
        System.out.println(ans);
    }
}
