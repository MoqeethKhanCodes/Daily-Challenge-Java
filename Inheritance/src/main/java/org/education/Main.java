package org.education;

public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);

        System.out.println(max);
        lineSeparator();

        PrimarySchoolStudent joe = new PrimarySchoolStudent("Joe", 5, "Carole");
        System.out.println(joe);

    }
    public static void lineSeparator() {
        System.out.println("----------------");
    }
}
