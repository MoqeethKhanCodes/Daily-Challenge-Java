package com.moqeethcodes;

public class Challenge {
    public static void main(String[] args) {
        /*int number = 4;
        int finishNumber = 20;

        while ((number <= finishNumber)){

            if (!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even Number" + number);
            number++;
        }
*/
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while ((number <= finishNumber)){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number = " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }

            number++;
        }
        System.out.println("Total Even Numbers Found = " + evenNumbersFound);

    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
