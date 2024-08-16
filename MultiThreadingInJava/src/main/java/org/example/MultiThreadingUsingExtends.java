package org.example;

public class MultiThreadingUsingExtends extends Thread {

    private int threadNumber;

    public MultiThreadingUsingExtends(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from threadNumber : " + threadNumber);

            /*if (threadNumber == 3) { //Does not stop other threads from executing
                throw new RuntimeException("Thread : " + threadNumber + " | Encountered an Exception!");
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
