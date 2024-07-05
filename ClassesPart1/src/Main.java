public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Grey");
        car.setDoors(2);
        car.setConvertible(true);
        car.describleCar();

        Car car1 = new Car();
        car1.setMake("Audi");
        car1.setModel("A8");
        car1.setColor("White");
        car1.setDoors(4);
        car1.setConvertible(false);
        car1.describleCar();

    }
}