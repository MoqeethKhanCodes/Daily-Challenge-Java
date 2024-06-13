import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> listOfText = new ArrayList<>();
        listOfText.add("   a b c  d    e  a  e f   ");
        listOfText.add(" Hi,  my name is John. John is a developer ");
        listOfText.add("");
        listOfText.add(" ");
        listOfText.add(null);

        for(String text : listOfText) {
            System.out.println("______________\n" + text);
            occurrenceOfEachWord(text);
        }
    }

    public static void occurrenceOfEachWord(String s) {
        HashMap<String, Integer> occurenceMap = new HashMap<>();
        if(s == null || s.isEmpty()) {
            return;
        }
        String[] strArray = s.split("\\s+");

        for (String text : strArray) {
            if (!text.isEmpty()) {
                occurenceMap.put(text, occurenceMap.getOrDefault(text, 0) + 1);
            }
        }

        occurenceMap.forEach((word, count) -> System.out.println(word + " " +count));
    }

    public static void occurrenceOfEachWordEasyToUnderstand (String s) {
        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        if (s != null && !s.isEmpty()) {

            String[] wordSplit = s.split("\\s+");

            for (String text : wordSplit) {
                if (!text.isEmpty()) {
                    if (occurrenceMap.containsKey(text)) {
                        occurrenceMap.put(text, occurrenceMap.get(text) + 1);
                    } else {
                        occurrenceMap.put(text, 1);
                    }
                }
            }
            for (Map.Entry<String, Integer> m : occurrenceMap.entrySet()) {

                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}