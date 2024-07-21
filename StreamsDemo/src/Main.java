import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Q1. Given a list of strings, we need to group them by their length using Java
        // Streams.
        List<String> strings = Arrays.asList("a", "bb", "ccc", "dd", "eee", "ffff", "ggggg");

        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        consoleSeparator();

        System.out.println("Grouped by length:");
        groupedByLength.forEach((key, value) -> System.out.println(key + " : " + value));
        consoleSeparator();

        //Q2. Filtering Strings of Length greater than 2
        List<String> filteredString = strings.stream()
                .filter(s -> s.length() > 2)
                .toList();

        System.out.println("Filtering Strings of Length greater than 2");
        filteredString.forEach(f -> System.out.println(" " + f));
        consoleSeparator();

        // Q3. Mapping strings to their upper case
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Mapping strings to their upper case");
        upperCaseStrings.forEach(System.out::println);
        consoleSeparator();

        // Q4. Counting the number of strings
        long count = strings.stream().count();
        System.out.println("Counting the number of strings\n" +count);
        consoleSeparator();

        // Q5. Finding the longest string
        Optional<String> longestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //or

        Optional<String> longestString1 = strings.stream()
                .max(Comparator.comparingInt(String::length));

        longestString.ifPresent(s -> System.out.println("Longest String : " + s));
        consoleSeparator();

        // Q6. Finding the shortest string
        Optional<String> shortestString = strings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //or

        Optional<String> shortestString1 = strings.stream()
                .min(Comparator.comparingInt(String::length));

        shortestString.ifPresent(s -> System.out.println("Shortest String : " + s));
        consoleSeparator();

        // Q7. Reducing to a single concatenated string with a delimiter
        String concatenatedString = strings.stream()
                .reduce((s1, s2) -> s1 + "-" +s2)
                .orElse("");

        System.out.println("Reducing to a single concatenated string with a delimiter\n" + concatenatedString);
        consoleSeparator();

        // Q8. Convert the string to a stream of characters and count occurrences
        Map<Character, Long> occurrences = strings.toString()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(character -> !Character.isWhitespace(character))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        occurrences.forEach((key, value) -> System.out.println(key + " : " + value));

    }

    public static void consoleSeparator() {
        System.out.print("---------------------------\n");
    }
}