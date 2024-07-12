public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String longestCommonPrefix(String[] stringText) {
        if (stringText == null || stringText.length == 0) return "";

        String prefix = stringText[0];

        for (int i = 1; i < stringText.length; i++) {

            while (stringText[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}