package com.moqeethcodes;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999 ){
            return false;
        }
        else{
            if((year % 4 == 0  && year % 100 != 0) || year % 400 == 0){
                return true;
            }
            else {
                return false;
            }
        }
    }

    private static final int INVALID_VALUE = -1;
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return INVALID_VALUE;
        }
        if (isLeapYear(year) && month == 2){
            return 29;
        }
       switch (month){
           case 11: case 9: case 6: case 4:
               return 30;

           case 2:
               return 28;
           default:
               return 31;
       }
    }
}
