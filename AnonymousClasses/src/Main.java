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
    }
}