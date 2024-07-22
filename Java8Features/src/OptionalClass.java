import java.util.Optional;

/**
 * OptionalClass:
 * The Optional class is a container object which may or may not contain a value.
 * It is used to avoid null references and provide a more expressive way of handling optional values.
 * */

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello, World!");

        // Using Optional to handle the presence of a value
        optionalValue.ifPresent(value -> System.out.println("Value: " + value));

        // Using Optional with a default value
        String result = optionalValue.orElse("Default Value");
        System.out.println("Result: " + result);
    }
}
