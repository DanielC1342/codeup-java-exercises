package shapes;

public class Circle {
    private double radius;
    public Circle(double radi) {
        radius = radi;
    }

    public double getArea() {
        return (2 * Math.PI * radius);
    }

    public double getCircumference() {
        return (Math.PI * (Math.pow(radius,2.0)));
    }
}
