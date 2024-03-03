import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter the secret key :");
            char character = scanner.next().charAt(0);
            switch (Character.toUpperCase(character)) {
                case 'A' -> System.out.println("A is Able\n");
                case 'B' -> System.out.println("B is Baker\n");
                case 'C' -> System.out.println("C is Charlie\n");
                case 'D' -> System.out.println("D is Dog\n");
                case 'E' -> System.out.println("E is Easy\n");
                default -> {
                    System.out.println("Letter " + character + " was not found in the switch statement");
                    flag = false;
                }
            }
        }
        scanner.close();
    }
}