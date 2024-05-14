import java.time.LocalDate;
import java.time.Period;

public class datetimeAPIPeriod {
    public static void main(String[] args) {
       LocalDate now= LocalDate.now();
        LocalDate then = LocalDate.of(1996,5,15);
        Period period=Period.between(now,then);
        System.out.println(period);

     
    }
}



