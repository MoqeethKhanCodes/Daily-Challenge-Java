import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SwitchCalendar {
    //private static final Logger logger = Logger.getLogger(SwitchCalendar.class.getName());

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
                Object [] dateObject = specificDateSearch(date);
                printInfo(dateObject);

            }
            case 2 -> {

                LocalDateTime currentDateTime = LocalDateTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

                String formattedDateTime = currentDateTime.format(formatter);

                Object [] dateObject = specificDateSearch(formattedDateTime);

                printInfo(dateObject);

            }
        }
        scanner.close();
    }

    private static Object[] specificDateSearch (String dateString) {
        System.out.println("specificDateSearch");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        LocalDate date = LocalDate.parse(dateString, formatter);

        return prepareDate(date);
    }

    private static Object[] prepareDate (LocalDate date) {
        Object [] object = new Object[4];
        object[0] = date.getDayOfMonth();
        object[1] = date.getMonth();
        object[2] = date.getYear();
        object[3] = date.getDayOfWeek();

        return object;
    }

    private static void printInfo (Object[] dateInfo) {
        System.out.println("Date Information : " + "\nDate : " + dateInfo[0] + " " + dateInfo[1] + " " + dateInfo[2] + " " + dateInfo[3]);
    }
}
