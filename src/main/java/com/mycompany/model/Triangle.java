package com.mycompany.model;

import com.mycompany.AbstractFigure;

public class Triangle extends AbstractFigure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println("I draw a TRIANGLE.");
    }

    @Override
    public double getArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public String toString() {
        return String.format("Figure: TRIANGLE | First Side: %s | Second Side: %s" +
                " | Third Side: %s | Color: %s", sideA, sideB, sideC, getColor());
    }
}
