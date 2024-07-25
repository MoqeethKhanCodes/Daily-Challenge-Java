import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Warren Buffet", 150));
        personList.add(new Person("Bill Gates", 125));
        personList.add(new Person("Moqeeth", 485));
        personList.add(new Person("Elon", 15));
        personList.add(new Person("Khan", 14));

        /*List<Person> hundredClub = new ArrayList<>();
        for (Person person : personList) {
            if (person.billions >= 100) {
                hundredClub.add(person);
            }
        }
        hundredClub.forEach(p -> {
            System.out.println(p.name);
        });*/

        List<Person> hundredClub = personList.stream()
                .filter(person -> person.billions >= 100)
                .toList();

        hundredClub.forEach(p -> {
            System.out.println(p.name);
        });

        System.out.println("--------------------------\nSORTED LIST");
        List<Person> sortedList = personList.stream()
                //.sorted(Comparator.comparing(person -> person.billions))
                .sorted(Comparator.comparingInt(Person::getBillions).reversed())
                .toList();
        sortedList.forEach(sl -> {
            System.out.println(sl.name);
        });
    }

    static class Person {
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }

        public int getBillions() {
            return billions;
        }
    }
}