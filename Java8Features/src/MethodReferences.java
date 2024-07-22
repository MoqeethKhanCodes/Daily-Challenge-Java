import java.util.Arrays;
import java.util.List;

/**
 * Method References:
 * Method references provides a way to refer to methods of existing classes or objects by their names.
 * They can be used to simplify lambda expressions.
 */
public class MethodReferences {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference to print each name
        names.forEach(MethodReferences::print);
    }
}
