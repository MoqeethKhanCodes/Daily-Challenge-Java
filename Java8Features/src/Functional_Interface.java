/**
 * Functional Interfaces:
 * A functional interface is an interface with a single abstract method.
 * They can be implemented using lambda expressions or method references.
 * */

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Functional_Interface {

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));
    }
}

