package com.mycompany.model;

import com.mycompany.AbstractFigure;

public class Trapezoid extends AbstractFigure {
    public final static int LEFT_BOTTOM_ANGLE_LIMIT = 178;

    private double bottomBase;
    private double topBase;
    private double leftLeg;
    private double rightLeg;
    private double height;

    public Trapezoid(double bottomBase, double topBase, double leftLeg,
                     double rightLeg, double height) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        this.leftLeg = leftLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        this.rightLeg = rightLeg;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("I draw a TRAPEZOID.");
    }

    public double getArea() {
        return height * (bottomBase + topBase) / 2;
    }

    @Override
    public String toString() {
        return String.format("Figure: TRAPEZOID # Bottom Base: %.2f | Top Base: %.2f" +
                " | Left Leg: %.2f | Right Leg: %.2f | Height: %.2f | Area: %.2f | Color: %s",
                bottomBase, topBase, leftLeg, rightLeg, height, getArea(), getColor());
    }
}
