package com.moqeethcodes;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for (int number = 1; number <= 1000; number++ ){
            if(number % 3 == 0 && number % 5 == 0){
                count++;
                sum += number;
                System.out.println("Found Number = " + number);
            }
            if (count == 5){
                break;
            }

        }
        System.out.println("Sum of factors of 3 and 5 = " + sum);
    }
}
