import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] romanArray = {"III", "LVIII", "MCMXCIV"};
        for (String roman : romanArray) {
            System.out.println(romanToIntBestCase(roman));
        }
    }

    public static int romanToIntBestCase(String s) {
        int finalNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanToInt(s.charAt(i));

            if (i < s.length() - 1 && currentValue < romanToInt(s.charAt(i + 1))) {
                finalNumber -= currentValue;
            } else {
                finalNumber += currentValue;
            }
        }
        return finalNumber;
    }

    public static int romanToInt(char roman) {//Solution 3 Runtime - 0ms
        if (roman == 'I') {
            return 1;
        } else if (roman == 'V') {
            return 5;
        } else if (roman == 'X') {
            return 10;
        } else if (roman == 'L') {
            return 50;
        } else if (roman == 'C') {
            return 100;
        } else if (roman == 'D') {
            return 500;
        } else if (roman == 'M') {
            return 1000;
        } else {
            return -1;
        }
    }

    public static int romanToIntAvg(char roman) {//Solution 2 Runtime - 3ms
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    public static int romanToIntWorstCase(String s) { //Solution 1 Runtime - 8ms
        Map<String, Integer> conversionMap = new HashMap<>();
        int finalNumber = 0;

        conversionMap.put("I", 1);
        conversionMap.put("V", 5);
        conversionMap.put("X", 10);
        conversionMap.put("L", 50);
        conversionMap.put("C", 100);
        conversionMap.put("D", 500);
        conversionMap.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i));
            int currentValue = conversionMap.get(currentSymbol);
            if (i < s.length() - 1 && conversionMap.get(String.valueOf(s.charAt(i))) < conversionMap.get(String.valueOf(s.charAt(i + 1)))) {
                finalNumber -= currentValue;
            } else {
                finalNumber += currentValue;
            }
        }
        return finalNumber;
    }
}