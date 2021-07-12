package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle();
        circle2.setRadius(3);

        System.out.printf("The circumference in cm of the first circle is %.2f", circle1.getCircumference());
        System.out.println("\n");
        System.out.printf("The area in sq.cm of the first circle is %.2f", circle1.getArea());
        System.out.println("\n");

        System.out.printf("The circumference in cm of the second circle is %.2f", circle2.getCircumference());
        System.out.println("\n");
        System.out.printf("The area in sq.cm of the second circle is %.2f", circle2.getArea());
        System.out.println("\n");

    }
}
