public class Main {
    public static void main(String[] args) {

        /*Printer printer = new Printer(true, 65);
        System.out.println("intial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(7);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        int pagesPrinted1 = printer.printPages(16);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted1, printer.getPagesPrinted());*/

        Printer printer = new Printer(true, 50);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}