package util;

import java.util.Scanner;

public class Input extends Exception{

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

    public static int getInt(int min, int max) throws Exception {
        int num;
        try {
            num = Integer.valueOf(scanner.next());
            if (num < min || num > max) {

                num = getInt(min,max);
            }
            return num;
        }catch (Exception e) {
            throw new Exception("Big time error, Number format Exception");
        }
    }

    public static int getInt() throws Exception {
        try {
            return Integer.valueOf(scanner.next());
        }catch (Exception e) {
            throw new Exception("Big time error, Number format Exception");
        }
    }

    public static double getDouble(double min, double max) throws Exception {
        double num;
        try {
            num = Double.valueOf(scanner.next());
            if (num < min || num > max) {
                System.out.println("Not within Parameters");
                num = getDouble(min,max);
            }
            return num;
        }catch (Exception e) {
            throw new Exception("Big time error, Number format Exception");
        }
    }

    public static double getDouble() throws Exception {
        try {
            return Double.valueOf(scanner.next());
        }catch (Exception e) {
            throw new Exception("Big time error, Number format Exception");
        }
    }

}

