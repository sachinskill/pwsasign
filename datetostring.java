import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datetostring {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String myDate=date.format(df);
        System.out.println(myDate);
    }
}
