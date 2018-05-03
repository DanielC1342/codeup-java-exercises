package util;

public class InputTest {
    public static void main(String[] args) {
        Input foo = new Input();
        System.out.println(foo.getString());
        System.out.println(foo.yesNo());
        System.out.println(foo.getInt());
        System.out.println(foo.getInt(1,10));
        System.out.println(foo.getDouble());
        System.out.println(foo.getDouble(1.0,10.0));
    }
}
