package com.udemylearning;

public class Main {

    public static void main(String[] args) {
        convertKmToCm(5,2);
        convertKmToCm( 557);
    }
    
    public static int convertKmToCm(int kiloMeters, int meters){
        if(kiloMeters < 0 || meters < 0){
            return -1;
        }

        int centiMeters = (kiloMeters * 1000) * 100;
        centiMeters += meters * 100;
        System.out.println(centiMeters);
        System.out.println(kiloMeters + " kilometers is equal to " + centiMeters + " centimeters ");
        return centiMeters;
    }
    
    public static int convertKmToCm(int meters){
        if (meters < 0){
            return  -1;
        }
        int centiMeters = meters * 100;

        System.out.println(meters + " meters is equal to " + centiMeters + " centimeters  ");
        return centiMeters;
        
    }
    
}
