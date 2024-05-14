import java.time.LocalDate;
import java.time.Month;


public class Localdate {
    public static void main(String[] args) {
      LocalDate now=  LocalDate.now();
        System.out.println(now); 

        LocalDate MyBirthday =LocalDate.of(2001,12,15);
        System.out.println(MyBirthday); 

        int DayOfMonth = now.getDayOfMonth();
        Month month= now.getMonth();
         int year = now.getYear();

        System.out.println(DayOfMonth);  
        System.out.println(month);      
        System.out.println(year);       


        LocalDate today= LocalDate.now();
        System.out.println(today);
        LocalDate CustomDate= LocalDate.of(2001,12,15);
        LocalDate Yesterday=today.minusDays(5);
        System.out.println(Yesterday);
        LocalDate pastDate =today.minusMonths(50);
        System.out.println(pastDate);
        

        if(today.isAfter(Yesterday)){
            System.out.println("yes"); 
        }


    }
}
