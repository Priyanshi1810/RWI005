

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datetimeformet {
    public static void main(String[] args) {

        LocalDate myLocalDate = LocalDate.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format= myLocalDate.format(myFormatter);
        System.out.println(myLocalDate);

        String date="13/05/2024";
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse= LocalDate.parse(date,dateTimeFormatter);
        System.out.println(parse);

        String DateTimeSting ="2024-05-28 11:10:30:44+05:30";
        DateTimeFormatter FORMATTER =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        System.out.println(FORMATTER);
    
    }
}
