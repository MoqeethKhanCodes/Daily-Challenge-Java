package com.moqeethcodes;

public class Main {

    public static void main(String[] args) {

        //while loop
        int count = 1;

        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        //for loop equivalent
       /* for(int i = 1; i < 7; i++){
            System.out.println("Count value is " + i);
        }*/

        //for loop equivalent
        /*for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }*/

        System.out.println("************************************");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }

            System.out.println("*****************************");

           /* count = 6;
            while (count != 6){
                System.out.println("Hi " + count);
                count++;
            } //never gets into the loop
*/
    }
}
