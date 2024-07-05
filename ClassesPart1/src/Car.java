public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isConvertible;

    public void describleCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";

        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }


}
