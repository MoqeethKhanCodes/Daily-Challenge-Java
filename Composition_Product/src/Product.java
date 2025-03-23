public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;


    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class Monitor extends Product {
    private int ramSlots;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int ramSlots, String resolution) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color as %s", x, y, color));
    }


}

class Motherboard extends Product {
    private int ramSlots;
    private int cartSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, String bios, int cartSlots, int ramSlots) {
        super(model, manufacturer);
        this.bios = bios;
        this.cartSlots = cartSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product {
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

