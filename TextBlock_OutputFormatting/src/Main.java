import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        // Simple Formatting
        String bulletList = "Print a Bulleted List : \n" +
                "   \u2022 Solid Bullet\n" +
                "       \u25E6 White Circle";
        System.out.println(bulletList);

        System.out.println("------------------\nEscape Characters");

        // Using Escape Characters
        String bulletList1 = "Print a Bulleted List : \n" +
                "\t\u2022 Solid Bullet\n" +
                "\t\t\u25E6 White Circle";
        System.out.println(bulletList1);

        System.out.println("------------------\nText Block");

        //Applicable since jdk 15 for multi line formatted string
        String textBlock = """
                Print a Bulleted List :
                    \u2022 Solid Bullet
                        \u25E6 White Circle""";
        System.out.println(textBlock);

        System.out.println("------------------\nPrintf");

        // For formatting to support cross-platform application supporting linux and macOS
        // PrintF for printing formatted String directly without storing into a variable
        int age = 18;
        System.out.printf("Your age is %d", age);

        System.out.println();

        int yearOfBirth = Calendar.getInstance().get(Calendar.YEAR) - age;
        System.out.printf("Age = %d, Birth Year = %d", age, yearOfBirth);

        System.out.println("------------------\nFormat Specifier - Class Formatter");

        System.out.printf("Your age is %f%n", (float) age);

        System.out.println("------------------");

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %d %n", i);
        }

        System.out.println("------------------\nRight Align");

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        System.out.println("------------------");

        // Formatting using String.format()
        System.out.println("Formatting using String.format()" );
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        //Below formatting method exist since JDK 15
        System.out.println("Formatting using stringValue.formatted()");
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}