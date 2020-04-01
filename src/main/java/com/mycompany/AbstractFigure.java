package com.mycompany;

import com.mycompany.exception.IllegalColorArgumentException;
import java.util.Random;

public abstract class AbstractFigure implements Figure {
    private final static int COLOR_NUMBER_LIMIT = 10;

    private String color;

    public AbstractFigure() {
        this.color = getRandomColor();
    }

    public abstract void draw();

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getRandomColor() {
        switch (new Random().nextInt(COLOR_NUMBER_LIMIT)) {
            case 0: return "White";
            case 1: return "Black";
            case 2: return "Red";
            case 3: return "Green";
            case 4: return "Blue";
            case 5: return "Yellow";
            case 6: return "Orange";
            case 7: return "Cyan";
            case 8: return "Magenta";
            case 9: return "Violet";
            default: throw new IllegalColorArgumentException("Color number error.");
        }
    }
}
