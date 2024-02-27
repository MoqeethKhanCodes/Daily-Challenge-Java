package com.moqeethlearning;

public class AreaCalculator {
    public static double area (double radius) {
        return radius < 0 ? -1 : Math.PI * radius * radius;
    }
    public static double area (double length, double breadth) {
        return (length < 0 || breadth < 0)  ? -1 :  length * breadth;
    }
}

