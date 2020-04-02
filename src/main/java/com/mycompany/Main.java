package com.mycompany;

import com.mycompany.exception.IllegalFigureArgumentException;
import com.mycompany.model.Sphere;
import com.mycompany.model.Square;
import com.mycompany.model.Trapezoid;
import com.mycompany.model.Triangle;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomFiguresNumber = new Random().nextInt(Figure.FIGURE_NUMBER_LIMIT);
        Figure[] randomFigures = new Figure[randomFiguresNumber];
        Arrays.setAll(randomFigures, i -> generateRandomFigure());

        System.out.println("FIGURES' FULL LIST:");
        for (int i = 0; i < randomFigures.length; i++) {
            System.out.println();
            System.out.printf("%d. %s%n", i + 1, randomFigures[i].toString());
            randomFigures[i].draw();
        }
    }

    private static Figure generateRandomFigure() {
        Random generateRandom = new Random();
        switch (generateRandom.nextInt(Figure.FIGURE_TYPE_QUANTITY)) {
            case 0: return new Square(generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT);
            case 1: return new Sphere(generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT);
            case 2: return generateTriangle(generateRandom);
            case 3: return generateTrapezoid(generateRandom);
            default: throw new IllegalFigureArgumentException("Figure choosing error.");
        }
    }

    private static Figure generateTriangle(Random generateRandom) {
        double sideA;
        double sideB;
        double sideC;

        while(true) {
            sideA = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            sideB = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            sideC = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
                return new Triangle(sideA, sideB, sideC);
            }
        }
    }

    private static Figure generateTrapezoid(Random generateRandom) {
        double bottomBase;
        double topBase;
        double leftLeg;
        double rightLeg;

        while(true) {
            bottomBase = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            topBase = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            leftLeg = generateRandom.nextDouble() * Figure.FIGURE_SIZE_LIMIT;
            if (topBase > 0 && bottomBase > topBase && leftLeg > 0) {
                double leftBottomAngle = generateRandom.nextDouble() * Trapezoid.LEFT_BOTTOM_ANGLE_LIMIT + 1;
                double height = leftLeg * Math.sin(Math.toRadians(leftBottomAngle));
                rightLeg = Math.sqrt(square(height)
                        + square(bottomBase - leftLeg * Math.cos(Math.toRadians(leftBottomAngle))));
                return new Trapezoid(bottomBase, topBase, leftLeg, rightLeg, height);
            }
        }
    }

    private static double square(double value){
        return value * value;
    }
}
