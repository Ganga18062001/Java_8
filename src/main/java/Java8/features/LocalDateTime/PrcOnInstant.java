package Java8.features.LocalDateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PrcOnInstant {
    public static void main(String[] args) throws InterruptedException {

        //it teturn time in milisecound

        long l = System.currentTimeMillis();
        System.out.println(l);//unix timeStamp

        //It return time in nanoSecound,
        //It  is used for machine timestamp

        Instant instant = Instant.now();
        //System.out.println(instant);

        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration between = Duration.between(start, end);
       // System.out.println(between);
        Duration duration = Duration.of(1, ChronoUnit.MILLIS);
       //System.out.println(duration);

        Thread.sleep(2000);

        LocalDateTime t1 = LocalDateTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        Duration between1 = Duration.between(t2, t1);
        //System.out.println(between1);

        LocalDate b1 = LocalDate.now();
        //LocalDate b2 = LocalDate.now();
        LocalDate l2 = LocalDate.of(2024, 06, 22);

        Period between2 = Period.between(b1, l2);
        System.out.println(between2);


    }
}
