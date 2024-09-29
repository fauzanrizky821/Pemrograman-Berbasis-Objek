package com;

public class Circle {

    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /* Getter & Setter for radius */
    /**
     * Returns the radius
     */

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }    

    /**
     * Returns the area of this Circle instance
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /* Getter & Setter for Color */
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}
