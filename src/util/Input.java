package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    String getString() {
        System.out.println("Give me a String");
        System.out.println(">");
        return scanner.nextLine();
    }

    boolean yesNo() {
        System.out.println("Is this statement true?");
        System.out.print(">");
        String bool = scanner.next();
        if (bool.equals("y")||bool.equals("Y")||bool.equals("yes")||bool.equals("Yes")) {
            return true;
        }else {
            return false;
        }
    }

    int getInt(int min, int max) {
        System.out.println("Give me an integer between " + min + " and " + max);
        System.out.print(">");
        int num = scanner.nextInt();
        if (num < min || num > max) {
            getInt(min,max);
        }
        return num;
    }

    public int getInt() {
        System.out.println("Give me a double");
        System.out.println(">");
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        System.out.println("Give me a Double between " + min + " and " + max);
        System.out.print(">");
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            getDouble(min,max);
        }
        return num;
    }

    double getDouble() {
        System.out.println("Give me a double");
        System.out.println(">");
        double num = scanner.nextDouble();
        return num;
    }

}

