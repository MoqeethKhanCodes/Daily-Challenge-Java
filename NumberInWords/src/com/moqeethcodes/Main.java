package com.moqeethcodes;

public class Main {

    public static void main(String[] args) {

        System.out.println("Using Switch Statement ");
        NumberInWords.printNumberInWord(0);
        NumberInWords.printNumberInWord(-1);
        NumberInWords.printNumberInWord(2);
        NumberInWords.printNumberInWord(3);
        NumberInWords.printNumberInWord(4);
        NumberInWords.printNumberInWord(9);
        NumberInWords.printNumberInWord(10);

        System.out.println("---------------------");
        System.out.println("Using If-Else");

        NumberInWordsIfElse.printNumberInWord(0);
        NumberInWordsIfElse.printNumberInWord(-1);
        NumberInWordsIfElse.printNumberInWord(2);
        NumberInWordsIfElse.printNumberInWord(3);
        NumberInWordsIfElse.printNumberInWord(4);
        NumberInWordsIfElse.printNumberInWord(5);
        NumberInWordsIfElse.printNumberInWord(10);
        NumberInWordsIfElse.printNumberInWord(9);



    }
}
