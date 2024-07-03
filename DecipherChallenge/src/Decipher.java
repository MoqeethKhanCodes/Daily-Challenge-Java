public class Decipher {

    public static void main(String[] args) {
        String encrypted = "VGXGPU";
        int k = 12;

        String result = simpleCipher(encrypted, k);

        System.out.println(result); // Output: "ABCD"
    }
    public static String simpleCipher(String encrypted, int k) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);

            if (Character.isUpperCase(ch)) {
                char decryptedCh = (char) ('A' + (ch - 'A' - k + 26) % 26);

                decrypted.append(decryptedCh);
            } else {
                // For non-alphabetic characters, simply append them as is
                decrypted.append(ch);
            }
        }

        return decrypted.toString();
    }

}