import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Duration_in_DateTime{
    public static void main(String[] args) {

        Instant start = Instant.now();
        int sum=0;
        for(int i=0; i<=1000000; i++){

            sum +=i+1;
        }
        Instant end = Instant.now();
        Duration D1= Duration.between(start,end);
        Duration D2= Duration.of(2, ChronoUnit.MILLIS);
        System.out.println(D1);
        System.out.println(D2);
       
        int i= D1.compareTo(D2);
        System.out.println(i);  


        Duration duration=Duration.between(start,end);
        LocalDateTime a=LocalDateTime.now();
        LocalDateTime b=LocalDateTime.now();
        Duration duration1=Duration.between(a,b);
        System.out.println(duration1); 
    }
}