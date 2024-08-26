package org.course;

public class Main extends Object{
    public static void main(String[] args) {
/*
        Animal animal = new Animal("Generic Animal", "Huge",500);
        doAnimalStuff(animal,"slow");

        Wolf wolf = new Wolf();
        doAnimalStuff(wolf, "fast");

        Wolf articWolf = new Wolf("Husky", 75);
        doAnimalStuff(articWolf, "very fast");

        Wolf redWolf = new Wolf("Red Wolf", 45, "Floppy", "Swimmer");
        doAnimalStuff(redWolf, "medium-paced");

        Wolf siberianWolf = new Wolf("Siberian Wolf", 60, "Sharp", "Fluffy");
        doAnimalStuff(siberianWolf, "Slow");
*/

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(goldie,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------------------");
    }
}