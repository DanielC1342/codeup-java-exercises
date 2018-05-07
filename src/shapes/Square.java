package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int sides) {
        super(sides,sides);
        side = sides;
    }

    public int getArea() {
        System.out.println("Sq. Override");
        return (side*side);
    }
    public int getPerimeter() {
        System.out.println("Sq. Override");
        return (side*4);
    }
}
