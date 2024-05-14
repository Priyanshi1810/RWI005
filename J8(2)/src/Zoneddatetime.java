import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


public class Zoneddatetime {
    public static void main(String[] args) {
        ZonedDateTime CurrentNow  = ZonedDateTime.now();
        Set<String> AvlableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(AvlableZoneIds);
        AvlableZoneIds.forEach(System.out::println);

        ZonedDateTime CustomIndianCocos = ZonedDateTime.of(
                2001,
                12,
                15,
                19,35,30,
                25,
                ZoneId.of("Indian/Cocos"));
        System.out.println(CustomIndianCocos); 

        ZonedDateTime IndianTime  = ZonedDateTime.now();
        System.out.println("Current time in India " + IndianTime);

        ZonedDateTime Hongkong = ZonedDateTime.now(ZoneId.of("Hongkong"));
        System.out.println("Current time in Hongkong"+ Hongkong);

       
    }
}


