package Java8.features.dateTime;

import java.time.LocalDate;
import java.time.Month;

public class PrcOnLocalDate {
    public static void main(String[] args) {

       LocalDate a =  LocalDate.now();
        //System.out.println(a);

        LocalDate customeDate = LocalDate.of(2001,06,18);
        System.out.println(customeDate);

        int year = a.getYear();
        Month  month = a.getMonth();
        int day = a.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }
}




