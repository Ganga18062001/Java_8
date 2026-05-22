package Java8.features.localTime;

import java.time.LocalTime;

public class PrcOnLocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customeTime = LocalTime.of(10, 45, 55);
       // System.out.println(customeTime);

        LocalTime parse = LocalTime.parse("10:23:22");
       // System.out.println(parse);
        int minute = parse.getMinute();
       // System.out.println(minute);

        LocalTime minusHours = now.minusHours(10);
        System.out.println(minusHours);
    }
}
