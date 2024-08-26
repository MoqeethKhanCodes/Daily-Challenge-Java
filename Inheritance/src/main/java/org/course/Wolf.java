package org.course;

public class Wolf extends Animal {
    private String earShape;
    private String tailShape;

    public Wolf() {
        super("Elena", "Medium", 52);
    }

    public Wolf(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Wolf(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 25 ? "small" : (weight < 55 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "type='" + type + '\'' +
                ", tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} -> " + super.toString();
    }

    public void makeNoise() {
        if (type.equalsIgnoreCase("Husky")) {
            System.out.println("Woof woof! ");
        } else {
            howl();
            System.out.println();
        }
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Wolf run to hunt it's prey ");
        if (speed.equalsIgnoreCase("slow")) {
            walk();
            wagTail();
        } else {
            run();
            howl();
        }
    }

    private void howl() {
        System.out.println("Oooooo! ");
    }

    private void run() {
        System.out.println("Wolf Pack running ");
    }

    private void walk() {
        System.out.println("Wolf Walking ");
    }

    private void wagTail() {
        System.out.println("Tail Wagging ");
    }
}
