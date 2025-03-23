public class Main {
    public static void main(String[] args) {

        ComputerCase theComputerCase = new ComputerCase("2208", "Dell", "240") ;

        Monitor theMonitor = new Monitor("27inch Immersive", "Samsung");

        Motherboard theMotherboard = new Motherboard("Z790", "Asus", "v2.99", 4, 6 );

        PersonalComputer thePersonalComputer = new PersonalComputer("2208", "Dell", theComputerCase, theMonitor, theMotherboard);

//        thePersonalComputer.getMonitor().drawPixelAt(10, 10, "red");
//        thePersonalComputer.getMotherboard().loadProgram("Windows OS");
//        thePersonalComputer.getComputerCase().pressPowerButton();

        thePersonalComputer.powerUp();

    }
} 