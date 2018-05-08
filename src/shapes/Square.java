package shapes;

public class Square extends Quadrilateral {

    public Square(int sides) {
        super(sides,sides);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
//
//    public int getArea() {
//        System.out.println("Sq. Override");
//        return (side*side);
//    }
//    public int getPerimeter() {
//        System.out.println("Sq. Override");
//        return (side*4);
//    }

}
