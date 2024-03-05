package com.moqeethcodes;

import java.util.Scanner;

public class NewSwitch {

    public static void main(String[] args) {

        System.out.println("Choose : \nOption A\nOption B\nOption C\nOption D\nOption E\n Others ");
        Scanner sc = new Scanner(System.in);
        char value = sc.next().charAt(0);

        switch (value) {

            case 'A' -> System.out.println("Value was A");

            case 'B' -> System.out.println("Value was B");

            case 'C', 'D', 'E' -> System.out.println(value + " was found");

            default -> System.out.println("Message not found");
        }

        System.out.println("\n Enter Month : ");
        sc.nextLine();
        String month = sc.nextLine();
        switch (month.toUpperCase()) {

            case "JANUARY" -> System.out.println("Jan");

            case "FEBRUARY" -> System.out.println("Feb");

            case "MARCH" -> System.out.println("Mar");

            case "APRIL" -> System.out.println("Apr");

            case "MAY" -> System.out.println("May");

            case "JUNE" -> System.out.println("June");

            case "JULY" -> System.out.println("July");

            case "AUGUST" -> System.out.println("Aug");

            case "SEPTEMBER" -> System.out.println("Sept");

            case "OCTOBER" -> System.out.println("Oct");

            case "NOVEMBER" -> System.out.println("Nov");

            case "DECEMBER" -> System.out.println("Dec");

            default -> System.out.println("Not Sure! ");
        }
    }
}
