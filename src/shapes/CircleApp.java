package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a radius (Must be a decimal)");
        double radius = sc.nextDouble();
        Circle inTheDark = new Circle(radius);
        System.out.println("The Area is " + inTheDark.getArea());
        System.out.println("The Circumference is " + inTheDark.getCircumference());

    }
}
