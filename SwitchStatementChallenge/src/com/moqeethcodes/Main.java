package com.moqeethcodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose : \nOption A\nOption B\nOption C\nOption D\nOption E\n Others ");
        Scanner sc = new Scanner(System.in);
        char value = sc.next().charAt(0);

        switch (value){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println( value + " was found");
                break;
            default:
                System.out.println("Message not found");
                break;
        }

        System.out.println("\n Enter Month : ");
        sc.nextLine();
        String month = sc.nextLine();
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "FEBRUARY":
                System.out.println("Feb");
                break;
            case "MARCH":
                System.out.println("Mar");
                break;
            case "APRIL":
                System.out.println("Apr");
                break;
            case "MAY":
                System.out.println("May");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            case "JULY":
                System.out.println("July");
                break;
            case "AUGUST":
                System.out.println("Aug");
                break;
            case "SEPTEMBER":
                System.out.println("Sept");
                break;
            case "OCTOBER":
                System.out.println("Oct");
                break;
            case "NOVEMBER":
                System.out.println("Nov");
                break;
            case "DECEMBER":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not Sure! ");
        }
    }
}
