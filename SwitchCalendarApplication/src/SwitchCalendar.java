import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchCalendar {
    private static final Logger logger = Logger.getLogger(SwitchCalendar.class.getName());

    public static void takeInputFromUser () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Calendar Search Format ");
        System.out.println("1. Specific Date Information. \n2. Current Date Information");

        int inputValue = scanner.nextInt();


        switch (inputValue) {
            case 1 -> {
                System.out.println("Please follow strict date format : dd month yyyy");
                scanner.nextLine();
                String date = scanner.nextLine();
                Object [] dateFormatted = specificDateSearch(date);

            }
            case 2 -> System.out.println("CurrentDate");
        }
        scanner.close();
    }

    public static Object[] specificDateSearch (String dateString) {
        System.out.println("specificDateSearch");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        LocalDate date = LocalDate.parse(dateString, formatter);


        Object [] object = new Object[4];
        object[0] = date.getDayOfMonth();
        object[1] = date.getMonth();
        object[2] = date.getYear();
        object[3] = date.getDayOfWeek();

        return object;
    }
}
