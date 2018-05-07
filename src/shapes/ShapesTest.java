package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("box1 Perimeter is "+box1.getPerimeter()); //18
        System.out.println("box1 Area is " + box1.getArea()); // 20
        System.out.println();
        Rectangle box2 = new Square(5);
        System.out.println("box2 Perimeter is "+box2.getPerimeter()); //20
        System.out.println("box2 Area is " + box2.getArea()); // 25
        System.out.println();

    }
}
