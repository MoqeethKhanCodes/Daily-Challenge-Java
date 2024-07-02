package com.moqeethcodes;

import java.util.Scanner;

public class NumberInWordsJava17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Terminate Sequence Initiated");
                break;
            }
            numberToWords1(number);

        }
    }

    // INVALID METHOD
    public static void printNumberInWord(int number) {

        String numberInWords = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberInWords);

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0)   {
            System.out.println("Zero");
        } else {
            int digit = 0;
            int temporary = reverse(number);
            int digitCount = getDigitCount(number);
            for (int i = 0; i < digitCount; i++) {
                digit = temporary % 10;
                temporary /= 10;
                switch (digit) {

                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                    default: {
                        System.out.println("");
                    }
                }

            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount (int number) {
        if(number < 0) {
            return -1;
        } else if (number == 0)   {
            return 1;
        }
        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }

    //Optimized without relying on other methods
    public static void numberToWords1(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int originalNumber = number;
            int digitCount = 0;
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
            number = originalNumber;
            int[] digits = new int[digitCount];
            for (int i = digitCount - 1; i >= 0; i--) {
                digits[i] = number % 10;
                number /= 10;
            }
            for (int i = 0; i < digitCount; i++) {
                switch (digits[i]) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.println();
                }
            }
            System.out.println();
        }
    }

}

