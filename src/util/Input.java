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
        int num;
        try {
            num = Integer.valueOf(scanner.next());
            if (num < min || num > max) {

                num = getInt(min,max);
            }
            return num;
        }catch (Exception e) {
            System.out.println("Error "+e);
        }
        return -1;
    }

    public static int getInt() {
        try {
            return Integer.valueOf(scanner.next());
        }catch (Exception e) {
            System.out.println("Error "+e);
        }
        return -1;
    }

    public static double getDouble(double min, double max) {
        double num;
        try {
            num = Double.valueOf(scanner.next());
            if (num < min || num > max) {
                System.out.println("Not within Parameters");
                num = getDouble(min,max);
            }
            return num;
        }catch (Exception e) {
            System.out.println("Error "+e);
        }
        return -1.0;
    }

    public static double getDouble() {
        try {
            return Double.valueOf(scanner.next());
        }catch (Exception e) {
            System.out.println("Error "+e);
        }
        return -1.0;
    }

}

