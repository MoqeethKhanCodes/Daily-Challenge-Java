package com.moqeethcodes;

public class FlourPackProblem {

    private static final boolean INVALID_INPUT = false;
    public static boolean canPack( int bigCount, int smallCount, int goal){
       if(bigCount < 0 || smallCount<0 || goal < 0){
           return INVALID_INPUT;
       }

        if(bigCount * 5 +smallCount < goal){
            return false;
        }
        return (goal % 5 <= smallCount);

    }
}
