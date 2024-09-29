package com;

public class Circle extends Shape {
    private double radius;

    // Constractor with no-arg
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constractor with super no-arg
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constractor with arg
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter &  Setter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" 
        + this.radius 
        + ", which is a subclass of " 
        + super.toString();
    }
}
