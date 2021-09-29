package com.udemylearning;

public class Challenge {

    public static void main(String[] args){

        byte byteValue  = 1;
        short shortValue  = 3;
        int integerValue  = 21;
        long longValue  = 50000L + 10L * (byteValue+shortValue+integerValue);
        System.out.println(longValue);

        short shortTotal = (short)(1000+10*(byteValue+shortValue+integerValue));
        System.out.println(shortTotal);
    }
}
