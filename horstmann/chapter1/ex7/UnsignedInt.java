package com.mycompany.horstmann.chapter1.ex7;

public class UnsignedInt {
    private int firstValue;
    private int secondValue;

    public UnsignedInt(String firstValue, String secondValue) {
        this.firstValue = Integer.parseUnsignedInt(firstValue);
        this.secondValue = Integer.parseUnsignedInt(secondValue);
    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = Integer.parseUnsignedInt(firstValue);
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = Integer.parseUnsignedInt(secondValue);
    }

    public int sum() {
        int sum = firstValue + secondValue;
        return sum;

    }

    public int dif() {
        int dif = firstValue - secondValue;
        return dif;
    }

    public int div() {
        return Integer.divideUnsigned(firstValue, secondValue);
    }

    public int remainder() {
        return Integer.remainderUnsigned(firstValue, secondValue);
    }

    public int multiply() {
        return 0;
    }


}
