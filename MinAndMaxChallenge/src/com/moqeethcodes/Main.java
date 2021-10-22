package com.moqeethcodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
//	    int min = 2147483647;
//        int max = -2147483648;
        /*int min = 0;
        int max = 0;
        boolean first = true;*/

	    while (true){
            System.out.println("Enter Number : ");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int number = sc.nextInt();
                /*if(first) {
                    first = false;
                    min = number;
                    max = number;
                }*/

                if(number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else{
                break;
            }
            sc.nextLine(); //handles input
        }
        System.out.println("Min = " + min + ", Max = " + max);
	    sc.close();
    }
}
