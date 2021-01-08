package com.mycompany.horstmann.chapter4.ex4andex5;

import com.mycompany.horstmann.chapter4.ex1and2.Point;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        Point point = getPoint();
        double x = point.getX() + width / 2;
        double y = point.getY() + height / 2;
        return new Point(x, y);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
