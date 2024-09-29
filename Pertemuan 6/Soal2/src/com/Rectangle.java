package com;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // Constructor with no-arg
    public Rectangle() {
        super();
    }

    // Contructor with super no-arg
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    
    // Contructor with arg
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter &  Setter
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    // Methods
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" 
        + this.width 
        + " and length=" 
        + this.length 
        + ", which is a subclass of " 
        + super.toString();
    }
}
