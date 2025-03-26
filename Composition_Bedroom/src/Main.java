public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed(4, 2, 1, 2, "Modern");

        Lamp lamp = new Lamp(false, 75, "Classic");

        Bedroom bedRoom = new Bedroom(bed, ceiling, lamp, "Ahmed Abdul Moqeeth Khan", wall1, wall2, wall3, wall4);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}