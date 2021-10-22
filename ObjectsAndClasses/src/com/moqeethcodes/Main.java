package com.moqeethcodes;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

       //returns String = "null" as we haven't entered setter method yet
       /* System.out.println("Model is " + porsche.getModel());*/
    
        porsche.setModel ("Carrera");
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
