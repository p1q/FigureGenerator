package com.mycompany.model;

import com.mycompany.AbstractFigure;

public class Square extends AbstractFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("I draw a SQUARE.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Figure: SQUARE # Side: %.2f | Area: %.2f | Color: %s",
                side, getArea(), getColor());
    }
}
