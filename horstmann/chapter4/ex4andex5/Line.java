package com.mycompany.horstmann.chapter4.ex4andex5;

import com.mycompany.horstmann.chapter4.ex1and2.Point;

public class Line extends Shape implements Cloneable{
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        Point from = getPoint();
        double x = (from.getX() + to.getX()) / 2;
        double y = (from.getY() + to.getY()) / 2;
        return new Point(x, y);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line cloned = (Line) super.clone();
        cloned.to = new Point(to.getX(), to.getY());
        return cloned;
    }
}

