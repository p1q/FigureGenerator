package com.mycompany;

public interface Figure {
    int FIGURE_TYPE_QUANTITY = 4;
    int FIGURE_NUMBER_LIMIT = 100;
    int FIGURE_SIZE_LIMIT = 20;

    void draw();

    double getArea();

    String getColor();
}
