public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side * (2 + 2 * Math.sqrt(2));
    }

    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public String toString() {
        return "Octagon [side=" + side + ", area=" + this.getArea() + ", perimeter=" + this.getPerimeter() + "]";
    }
}
