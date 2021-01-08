package com.mycompany.horstmann.chapter4.ex4andex5;

import com.mycompany.horstmann.chapter4.ex1and2.Point;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone();
    }
}
