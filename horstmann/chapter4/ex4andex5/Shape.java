package com.mycompany.horstmann.chapter4.ex4andex5;

import com.mycompany.horstmann.chapter4.ex1and2.Point;

public abstract class Shape implements Cloneable{
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void moveBy(double dx, double dy) {
        point.setXY(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape cloned = (Shape) super.clone();
        cloned.point = new Point(point.getX(), point.getY());
        return cloned;
    }
}
