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

//printing the local date and time
import java.util.*;
import java.time.*;

class main{
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

// IMP
// LocalDate format = 2024-05-05
// Date d = new Date() format = Sun May 05 07:21:09 GMT 2024
