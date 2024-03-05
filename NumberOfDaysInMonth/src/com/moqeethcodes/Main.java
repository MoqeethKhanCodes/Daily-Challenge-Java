package com.moqeethcodes;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,287254));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonthAlternate(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonthAlternate(1,2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonthAlternate(-1,287254));
        System.out.println(NumberOfDaysInMonth.getDaysInMonthAlternate(2,2000));


    }
}
