package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String bool = scanner.next();
        if (bool.equals("y")||bool.equals("Y")||bool.equals("yes")||bool.equals("Yes")) {
            return true;
        }else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        int num = scanner.nextInt();
        if (num < min || num > max) {
            num = getInt(min,max);
        }
        return num;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max) {
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            num = getDouble(min,max);
        }
        return num;
    }

    public static double getDouble() {
        double num = scanner.nextDouble();
        return num;
    }

}

