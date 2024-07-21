/**
 * Anonymous Classes:
 * Anonymous classes in Java are inner classes without a declared name.
 * These classes must be used to instantiate only one object ever.[Best Practise]
 * They can be used to extend a superclass or implement an interface.
 * Cannot Implement Multiple Interfaces.
 * Lambda functions provide a more concise way to implement functional interfaces since Java 8.
 */

public class Main {
    public static void main(String[] args) {

        //Anonymous Classes with Concrete Class
        Animal myAnimal = new Animal() {
            //Anonymous Classes even works without overriding any method.
            @Override
            public void makeNoise() {
                System.out.println("Meow Meow");
            }
        };
        myAnimal.makeNoise();

        //Anonymous Classes with implementing Interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello there!");
            }
        };
        greeting.sayHello();

        //or use lambda expression for anonymous classes
        Runnable myAnonymousRunnable = () -> System.out.println("I'm an anonymous runnable");
        myAnonymousRunnable.run();

    }
}