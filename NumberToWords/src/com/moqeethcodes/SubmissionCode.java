package com.moqeethcodes;

public class SubmissionCode{
    public static void numberToWords(int number){
        if(number<0) System.out.print("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
            int digit = number%10;
            switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
            }
            number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        while(number!=0) {
            reverse = (reverse*10) + number%10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number<0)
            return -1;
        int count = 1;
        while (number > 9){
            number /= 10;
            count++;

        }
        return count;
    }
}