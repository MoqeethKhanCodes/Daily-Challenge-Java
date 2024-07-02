import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromConsole());
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner());
        }
    }

    //  This method only works using Terminal or CMD Code Execution.
    public static String getInputFromConsole() {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for connecting with me!");

        String yearOfBirth = System.console().readLine("What year you were born in? ");
        int age = LocalDate.now().getYear() - Integer.parseInt(yearOfBirth);
        return "So you are " + age + " years old";

    }

    // This method is executable via IDE
    public static String getInputFromScanner() {
        System.out.println("Hi, What's your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for connecting with me!");

        System.out.println("What year you were born in? ");
        int yearOfBirth = scanner.nextInt();
        int age = LocalDate.now().getYear() - yearOfBirth;

        scanner.close();
        return "So you are " + age + " years old";

    }
}