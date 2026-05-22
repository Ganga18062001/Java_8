package Java8.features.localDate;

import java.time.LocalDate;
import java.time.Month;

public class PrcOnLocalDate {
    public static void main(String[] args) {

       LocalDate date =  LocalDate.now();
        System.out.println(date);

        LocalDate customeDate = LocalDate.of(2001,06,18);
        //System.out.println(customeDate);



        int year = date.getYear();
        Month  month = date.getMonth();
        int day = date.getDayOfMonth();
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);

        LocalDate minused = date.minusDays(1);
        System.out.println(minused);

        LocalDate minusYears = date.minusYears(10);
        System.out.println(minusYears);

    }
}




