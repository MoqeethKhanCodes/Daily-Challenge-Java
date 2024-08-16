package org.example;

public class Main {
    public static void main(String[] args) {
//        MultiThreadingUsingExtends multiThreadingExample = new MultiThreadingUsingExtends();
//        multiThreadingExample.start();
//        MultiThreadingUsingExtends multiThreadingExample1 = new MultiThreadingUsingExtends();
//        multiThreadingExample1.start();


        /**By Extending Thread Class*/
        for (int i = 1; i <= 5; i++){
            MultiThreadingUsingExtends multiThreadingExample=new MultiThreadingUsingExtends(i);
            multiThreadingExample.start();
        }

        /**By Implementing Runnable Interface"*/
        for (int i = 1; i <= 5; i++){
            MultiThreadingUsingImplements multiThreadingUsingImplements=new MultiThreadingUsingImplements();
            Thread thread = new Thread(multiThreadingUsingImplements);
            thread.start();
        }
    }
}