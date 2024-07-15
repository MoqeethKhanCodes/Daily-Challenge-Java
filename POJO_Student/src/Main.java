public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            Student s = new Student("124580" + i,
                    switch (i) {
                        case 1 -> "Ahmed";
                        case 2 -> "Moqeeth";
                        case 3 -> "Lisa";
                        case 4 -> "Carol";
                        case 5 -> "Jim";
                        default -> "Anonymous";
                    },
                    switch (i) {
                        case 1 -> "01/11/1997";
                        case 2 -> "05/21/1997";
                        case 3 -> "01/01/1997";
                        case 4 -> "05/11/1999";
                        case 5 -> "05/11/1997";
                        default -> "NULL";
                    }, "Java Batch");
            System.out.println(s);
        }
    }
}


