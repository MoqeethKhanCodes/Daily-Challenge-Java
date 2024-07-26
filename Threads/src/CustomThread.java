public class CustomThread extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 1; i <= 5; i++) {
            System.out.print(" 1 ");
            try {
                Thread.sleep(500);
            }catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

}
