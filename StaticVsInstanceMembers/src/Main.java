public class Main {
    // Static variable
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter = 0;

    // Constructor
    public Main() {
        staticCounter++;
        instanceCounter++;
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();

        System.out.println("Static Counter: " + Main.staticCounter); // Output: 3
        System.out.println("Instance Counter for obj1: " + obj1.instanceCounter); // Output: 1
        System.out.println("Instance Counter for obj2: " + obj2.instanceCounter); // Output: 1
    }
}
