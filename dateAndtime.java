import java.time.LocalDate;

public class dateAndtime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(15); // Example: sets the day of the month to 15
        System.out.println(date);
    }
}
