// import java.time.format.DateTimeFormatter;
// import java.util.*;
// import java.time.LocalDate;

// public class date3 {
    
//     public static void main(String[] args)
//     {

//     Scanner scanner = new Scanner(System.in);
//     String datestr;
//     datestr = scanner.nextLine();

//     DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//     LocalDate ld = LocalDate.parse(datestr,f);
    
//     System.out.println(ld);

//     scanner.close();

//     }
// }


// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.*;

// public class date3 {

//     public static void main(String[] args){

//         LocalDateTime dt = LocalDateTime.now();
//         System.out.println(dt);

//         Date d = new Date();
//         System.out.println(d);

//         DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         String finalDate = dt.format(df);
//         System.out.println(finalDate);

//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter date dd-mm-yyyy ");
//         String nowdate = scan.nextLine();

//         LocalDate ld = LocalDate.parse(nowdate,df);
//         System.out.println(ld);
// }
// }


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date3 {

    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Date d = new Date();
        System.out.println(d);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String finalDate = dt.format(df);
        System.out.println(finalDate);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter date dd-mm-yyyy: ");
        String inputDate = scan.nextLine();
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(inputDate, inputFormatter);
        
        String formattedDate = localDate.format(df);
        System.out.println("Formatted date: " + formattedDate);
    }
}


import java.time.*;
import java.time.format.*;
import java.util.*;

public class main {
    public static void main(String[] args){
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter date dd-MM-yyyy");
        String date = scan.nextLine();
        
        LocalDate ld = LocalDate.parse(date,df);
        
        System.out.println(ld);
        
    }
}
