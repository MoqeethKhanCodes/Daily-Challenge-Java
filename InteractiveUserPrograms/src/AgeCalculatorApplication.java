import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculatorApplication {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    //  This method only works using Terminal or CMD Code Execution.
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for connecting with me!");

        String yearOfBirth = System.console().readLine("What year you were born in? ");
        int age = LocalDate.now().getYear() - Integer.parseInt(yearOfBirth);
        return "So you are " + age + " years old";

    }

    // This method is executable via IDE
    public static String getInputFromScanner(int currentYear) {
        int age = 0;
        boolean validDOB = false;
        System.out.println("Hi, What's your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for connecting with me!");

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 150) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;

            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Input!!! Try again. ");
            }
        } while (!validDOB);

        scanner.close();
        return "So you are " + age + " years old";

    }

    public static int checkData(int currentYear, String yearOfBirth) {
        int dob = Integer.parseInt(yearOfBirth);
        int minimumYear = currentYear - 130;

        if ((dob < minimumYear || dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
