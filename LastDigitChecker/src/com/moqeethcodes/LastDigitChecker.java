package com.moqeethcodes;

public class LastDigitChecker {

    private static final boolean INVALID_INPUT = false;

    public static boolean hasSameLastDigit(int one, int two, int three){

        int digitOne,digitTwo,digitThree;

        if(isValid(one) && isValid(two) && isValid(three)){
            digitOne = one % 10;
            digitTwo = two % 10;
            digitThree = three % 10;

            if((digitOne == digitTwo) || (digitOne == digitThree) || (digitTwo == digitThree)){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000 ){
            return INVALID_INPUT;
        }
        return true;
    }
}