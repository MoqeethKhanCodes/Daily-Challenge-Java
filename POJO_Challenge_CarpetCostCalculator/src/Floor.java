public class Floor {
    private double length;
    private double width;

    public Floor(double width, double length) {
        this.width = Math.max(width, 0.0);
        this.length = Math.max(length, 0.0);
    }

    public double getArea() {
        return this.width * this.length;
    }

}