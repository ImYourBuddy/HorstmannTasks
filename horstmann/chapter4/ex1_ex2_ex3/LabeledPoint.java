package com.mycompany.horstmann.chapter4.ex1_ex2_ex3;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint() {
    }

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "(" + label +
                ", " + super.getX() +
                ", " + super.getY() +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        boolean labelEquals = (label == null && that.label == null)
                || (label != null && label.equals(that.label));
        return labelEquals;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (label == null ? 0 : label.hashCode());
        return result;
    }

}
