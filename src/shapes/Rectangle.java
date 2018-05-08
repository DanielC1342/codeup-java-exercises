package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double len, double wid) {
        super(len,wid);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }
//    private int length;
//    private int width;
//
//    public Rectangle(int len,int wid) {
//        length = len;
//        width = wid;
//    }
//    public int getArea() {
//        return (length*width);
//    }
//    public int getPerimeter() {
//        return ((2*length)+(2*width));
//    }

}
