package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(3);
        System.out.println("The Area of the shape is "+myShape.getArea());
        System.out.println("The Perimeter of the shape is "+myShape.getPerimeter());

    }
}
