public class Lambda {

    /*public static void main(String[] args) {
        Cat myCat = new Cat();
        //myCat.soundsLike(); //or
        soundOf(myCat);
    }*/

    public static void main(String[] args) {

        // Lambda | No need of Cat class or Cat Obj
        soundOf(
                () -> {
            System.out.println("Meow Meow");
        });

        //or

        AnimalVoice makeCatNoiseAgain = () -> System.out.println("Meow");
        soundOf(makeCatNoiseAgain);
    }

    static void soundOf (AnimalVoice animalVoice) {
        animalVoice.soundsLike();
    }
}
