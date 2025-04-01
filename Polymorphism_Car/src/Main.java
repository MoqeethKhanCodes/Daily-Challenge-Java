public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz S-Class S-850");
        runRace(car);

        Car maybach = new GasPoweredCar("Mercedes Maybach", 10.8,8);
        runRace(maybach);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}