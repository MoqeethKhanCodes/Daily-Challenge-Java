public class WallArea {
    private double height;
    private double width;

    public WallArea() {
    }

    public WallArea(double height, double width) {
        this.height = height < 0.0 ? 0.0 : height;
        this.width = width < 0.0 ? 0.0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0.0 ? 0.0 : height;
    }

    public void setWidth(double width) {
        this.width = width < 0.0 ? 0.0 : width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
