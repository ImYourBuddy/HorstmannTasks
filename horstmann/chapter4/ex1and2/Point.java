package com.mycompany.horstmann.chapter4.ex1and2;

public class Point {
    private double x;
    private double y;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //For moveBy() method in Shape class
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x=" + x +
                ", y=" + y + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        boolean xEquals = (Math.abs(x - point.x) < 0.000001);
        boolean yEquals = (Math.abs(y - point.y) < 0.000001);
        return xEquals && yEquals;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        return result;
    }
}
