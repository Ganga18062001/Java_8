package Java8.features.LocalDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class PrcOnZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
       System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/Rainy_River"));
        System.out.println(zonedDateTime1);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //availableZoneIds.forEach(System.out::println);
    }
}
