package com;

public class Shape {
    private String color;
    private boolean filled;

    // Constractor with no-arg
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with arg
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    
    // Getter & Setter
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method
    @Override
    public String toString() {
        return "A Shape with color of " 
        + this.color 
        + " and " 
        + ((this.isFilled()) ? "filled" : "not filled");
    }
}
