import java.time.LocalTime;


public class Localtime {
    public static void main(String[] args) {

        LocalTime  now = LocalTime.now();
        System.out.println(now);

       LocalTime CustomTime= LocalTime.of(2,41,30);
        System.out.println(CustomTime); 

       LocalTime ParsedTime  =LocalTime.parse("15:44:45") ;
        System.out.println(ParsedTime); 

        LocalTime BeforeTwoHour = now.minusHours(2);
        System.out.println(now);
        System.out.println(BeforeTwoHour); 

        if(now.isAfter(BeforeTwoHour)){
            System.out.println("Yes "); 

        }
        else {
            System.out.println("No");
        }




    }
}
