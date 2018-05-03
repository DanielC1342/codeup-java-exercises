package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    String getString() {
        System.out.println("Give me a String");
        return scanner.nextLine();
    }

    boolean yesNo() {
        System.out.println("Is this statement true?");
        String bool = scanner.next();
        if (bool.equals("y")||bool.equals("Y")||bool.equals("yes")||bool.equals("Yes")) {
            return true;
        }else {
            return false;
        }
    }

    int getInt(int min, int max) {
        System.out.println("Give me an integer between " + min + " and " + max);
        int num = scanner.nextInt();
        if (num < min || num > max) {
            num = getInt(min,max);
        }
        return num;
    }

    public int getInt() {
        System.out.println("Give me an int");
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        System.out.println("Give me a Double between " + min + " and " + max);
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            num = getDouble(min,max);
        }
        return num;
    }

    double getDouble() {
        System.out.println("Give me a double");
        double num = scanner.nextDouble();
        return num;
    }

}

