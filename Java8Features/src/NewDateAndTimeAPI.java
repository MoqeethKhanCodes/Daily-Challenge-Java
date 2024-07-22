import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * New Date And Time API:
 * The new Date and Time API (in java.time package) provides a comprehensive and immutable date and time model.
 * */

public class NewDateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Today's Date: " + today);
        System.out.println("Current DateTime: " + now);

        // Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
