public class Cat implements AnimalVoice{
    public String name;
    public int age;

    public Cat() {
    }

    @Override
    public void soundsLike() {
        System.out.println("Meow");
    }
}