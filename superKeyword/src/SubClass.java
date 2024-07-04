public class SubClass extends SuperClass{
    @Override
    public void printMethod() {
        super.printMethod();
        //this.printMethod(); // Recursion
        //printMethod(); // Recursion

        System.out.println("Printed in SubClass");
    }
}
