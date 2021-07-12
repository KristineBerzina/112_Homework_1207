package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle () {};

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    public double getArea() {
        return Math.PI*(this.radius*this.radius);
    }
}
