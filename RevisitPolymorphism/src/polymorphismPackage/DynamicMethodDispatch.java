package polymorphismPackage;

class Computer{

    public void processor() {
        System.out.println("Intel Core i9 14900 KS");
    }
}

class Laptop extends Computer{

    @Override
    public void processor() {
        System.out.println("Intel Mobile i9 14980 HX");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor(); // executes Parent Class

        Computer mobileComputer = new Laptop(); // Upcasting
        mobileComputer.processor(); // executes Child Class --- DynamicMethodDispatch --- JVM decides it which method to execute at runtime

        /*Laptop laptop = new Computer();
        laptop.processor();*/ // compile time error
    }
}