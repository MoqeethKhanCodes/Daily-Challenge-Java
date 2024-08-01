import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SpecificDateTimeExample {
    public static void main(String[] args) {
        // Setting a specific date
        LocalDate specificDate = LocalDate.of(2024, 7, 21); // YYYY, MM, DD
        System.out.println("Specific Date: " + specificDate);

        // Setting a specific time
        LocalTime specificTime = LocalTime.of(14, 30); // HH, MM
        System.out.println("Specific Time: " + specificTime);

        // Setting a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 21, 14, 30);
        System.out.println("Specific DateTime: " + specificDateTime);
    }
}
