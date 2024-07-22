
/**
 * Default Methods in Interfaces:
 * Default methods allow interfaces to provide a default implementation of methods, which can be overridden by implementing classes.
 * */
interface MyInterface {
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default implementation");
    }
}

public class DefaultMethodsInInterfaces implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation");
    }

    public static void main(String[] args) {
        MyInterface obj = new DefaultMethodsInInterfaces();
        obj.abstractMethod();
        obj.defaultMethod();
    }
}
