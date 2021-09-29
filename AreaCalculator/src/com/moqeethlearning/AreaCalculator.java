package com.moqeethlearning;

public class AreaCalculator {

    private static final double INVALID_VALUES = -1.0;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUES;
        }

        double areaOfACircle = (Math.PI) * radius * radius;
        return areaOfACircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0 ){
            return  INVALID_VALUES;
        }

        double areaOfARectangle = x * y;
        return  areaOfARectangle;
    }

}

