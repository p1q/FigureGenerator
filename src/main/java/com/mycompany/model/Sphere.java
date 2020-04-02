package com.mycompany.model;

import com.mycompany.AbstractFigure;

public class Sphere extends AbstractFigure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I draw a SPHERE.");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Figure: SPHERE # Radius: %.2f | Area: %.2f | Color: %s",
                radius, getArea(), getColor());
    }
}
