import java.util.Arrays;
import java.util.List;

/**
 * Streams API:
 * The Streams API allows for functional-style operations on sequences of elements, such as collections.
 * It supports operations like map, filter, and reduce.
 * */

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Streams API to filter and collect
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even Numbers: " + evenNumbers);
    }
}

