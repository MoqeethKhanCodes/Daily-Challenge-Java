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
        System.out.println("---------------------------\nDifferences | POJO vs Record\n");
        Student pojoStudent = new Student("S9554215", "Ann","05/11/1997", "Python Batch");

        Records_Student recordsStudent = new Records_Student("S9554212", "Annie","11/11/2000", "JavaScript Batch");

        System.out.println("POJO : \n" + pojoStudent + "\n\nRecord : \n" +recordsStudent);

        System.out.println("\n---------------------------");

        //Accessor Methods
        System.out.println("ACCESSOR DEMO");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordsStudent.name() + " is taking " + recordsStudent.classList());

        //Setters Methods
        pojoStudent.setClassList("Spring Classes");
        //recordsStudent.setClassList("Spring Classes"); // Records doesn't support setters as it is  private and final

       }
}


