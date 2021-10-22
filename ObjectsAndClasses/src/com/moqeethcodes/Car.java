package com.moqeethcodes;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //used to update values in Encapsulated Classes
    public void setModel(String model){
        //validation
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    //used to read values in Encapsulated Classes
    public String getModel() {
        //validation
        return this.model;
    }


}
