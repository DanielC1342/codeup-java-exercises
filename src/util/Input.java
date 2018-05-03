package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    String getString() {
        return scanner.nextLine();
    }

    boolean yesNo() {
        String bool = scanner.next();
        if (bool.equals("y")||bool.equals("Y")||bool.equals("yes")||bool.equals("Yes")) {
            return true;
        }else {
            return false;
        }
    }

    int getInt(int min, int max) {
        int num = scanner.nextInt();
        if (num < min || num > max) {
            num = getInt(min,max);
        }
        return num;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            num = getDouble(min,max);
        }
        return num;
    }

    double getDouble() {
        double num = scanner.nextDouble();
        return num;
    }

}

