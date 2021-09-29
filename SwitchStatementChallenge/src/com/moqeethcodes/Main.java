package com.moqeethcodes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        char value = sc.next().charAt(0);*/
        char value = 'D';
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

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "Febuary":
                System.out.println("Feb");
                break;
            case "March":
                System.out.println("Mar");
                break;
            case "April":
                System.out.println("Apr");
                break;
            case "May":
                System.out.println("May");
                break;
            case "June":
                System.out.println("June");
                break;
            case "July":
                System.out.println("July");
                break;
            case "August":
                System.out.println("Aug");
                break;
            case "September":
                System.out.println("Sept");
                break;
            case "October":
                System.out.println("Oct");
                break;
            case "November":
                System.out.println("Nov");
                break;
            case "December":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not Sure! ");
        }
    }
}
