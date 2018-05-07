package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int len,int wid) {
        length = len;
        width = wid;
    }
    public int getArea() {
        return (length*width);
    }
    public int getPerimeter() {
        return ((2*length)+(2*width));
    }
}
