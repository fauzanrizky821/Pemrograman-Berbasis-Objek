package com;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return super.getWidth();
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" 
        + super.getWidth() 
        + ", which is a subclass of " 
        + super.toString();
    }
}
