package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double len, double wid) {
        length = len;
        width = wid;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength();
    public abstract void setWidth();
}
