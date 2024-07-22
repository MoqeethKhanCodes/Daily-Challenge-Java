import java.util.Arrays;
import java.util.List;


/**
 * Lambda Expressions:
 * Lambda expressions allow you to write concise code and pass behavior as parameters.
 * They are particularly useful for working with functional interfaces.
 * */
public class LambdaFunctions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
}
