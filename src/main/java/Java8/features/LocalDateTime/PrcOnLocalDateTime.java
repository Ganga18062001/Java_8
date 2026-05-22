package Java8.features.LocalDateTime;

import java.time.LocalDateTime;

public class PrcOnLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime parse = LocalDateTime.parse("2025-12-15T12:21:45");
        System.out.println(parse);
    }
}
