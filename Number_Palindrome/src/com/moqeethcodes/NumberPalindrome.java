package com.moqeethcodes;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int lastDigit = 0, reverse = 0;
        int num = number;

        while(num != 0){

            // reading last digit
            lastDigit = num % 10;

            // finding the last second digit
            reverse *= 10;

            // adding it to the result
            reverse += lastDigit;

            // ejecting last digit as it is stored in reverse.
            num = num / 10;


        }

        if(reverse == number) {
            return true;

        }else{
            return false;
        }
    }
}
