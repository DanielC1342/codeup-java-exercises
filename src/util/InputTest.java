package util;

public class InputTest {
    public static void main(String[] args) {
        Input foo = new Input();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("You input "+foo.getString());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("That is "+foo.yesNo());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("You input "+foo.getInt());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("You input "+foo.getInt(1,10));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("You input "+foo.getDouble());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("You input "+foo.getDouble(1.0,10.0));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
