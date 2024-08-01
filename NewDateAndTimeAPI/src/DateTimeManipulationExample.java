import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeManipulationExample {
    public static void main(String[] args) {
        // Adding and subtracting days
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);

        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Yesterday: " + yesterday);

        // Adding and subtracting hours
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime later = now.plusHours(2);
        LocalDateTime earlier = now.minusHours(2);

        System.out.println("Now: " + now);
        System.out.println("Later: " + later);
        System.out.println("Earlier: " + earlier);

        // Adding and subtracting using ChronoUnit
        LocalTime time = LocalTime.now();
        LocalTime laterTime = time.plus(15, ChronoUnit.MINUTES);
        LocalTime earlierTime = time.minus(15, ChronoUnit.MINUTES);

        System.out.println("Current Time: " + time);
        System.out.println("Later Time: " + laterTime);
        System.out.println("Earlier Time: " + earlierTime);
    }
}
