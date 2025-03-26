public class Bedroom {
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Bed bed, Ceiling ceiling, Lamp lamp, String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        bed.make();
    }
}

class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

class Ceiling {
    private int height, paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}

class Bed {
    private String style;
    private int pillows, height, sheets, quilt;

    public Bed(int height, int pillows, int quilt, int sheets, String style) {
        this.height = height;
        this.pillows = pillows;
        this.quilt = quilt;
        this.sheets = sheets;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }

    public void make() {
        System.out.println("the bed is being made");
    }
}

class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(boolean battery, int globRating, String style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public String getStyle() {
        return style;
    }

    public void turnOn() {
        System.out.println("Lamp is turned on!");
    }
}