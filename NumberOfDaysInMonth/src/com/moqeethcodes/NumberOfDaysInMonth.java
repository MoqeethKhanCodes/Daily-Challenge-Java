package com.moqeethcodes;

public class NumberOfDaysInMonth {

    private static final int INVALID_VALUE = -1;

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        if (isLeapYear(year) && month == 2){
            return 29;
        }
        return switch (month) {
            case 11, 9, 6, 4 -> 30;
            case 2 -> 28;
            default -> 31;
        };
    }
}
