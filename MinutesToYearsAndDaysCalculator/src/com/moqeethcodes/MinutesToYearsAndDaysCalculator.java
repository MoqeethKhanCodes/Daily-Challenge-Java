package com.moqeethcodes;

public class MinutesToYearsAndDaysCalculator {
    private static final String INVALID_VALUES = "Invalid Value";

    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println(INVALID_VALUES);
        }else{
            // 1 year = 525600 Minutes;
            // 1 day = 1440 Minutes;
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
