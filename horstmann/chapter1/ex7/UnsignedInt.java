package com.mycompany.horstmann.chapter1.ex7;

/**
 * This class describes operations on unsigned int. Negative numbers correspond to positive numbers greater than
 * Integer.MAX_VALUE
 */
public class UnsignedInt {
    private int firstValue;
    private int secondValue;

    public UnsignedInt(String firstValue, String secondValue) {
        this.firstValue = Integer.parseUnsignedInt(firstValue);
        this.secondValue = Integer.parseUnsignedInt(secondValue);
    }

    public String getFirstValue() {
        return Integer.toUnsignedString(firstValue);
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = Integer.parseUnsignedInt(firstValue);;
    }

    public String getSecondValue() {
        return Integer.toUnsignedString(secondValue);
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = Integer.parseUnsignedInt(secondValue);
    }

    public String sum() {
        return Integer.toUnsignedString(firstValue + secondValue);

    }

    public String dif() {
        return Integer.toUnsignedString(firstValue - secondValue);
    }

    public String quotient() {
        return Integer.toString(Integer.divideUnsigned(firstValue, secondValue));
    }

    public String remainder() {
        return Integer.toString(Integer.remainderUnsigned(firstValue, secondValue));
    }

    public String product() {
        return Integer.toUnsignedString(firstValue * secondValue);
    }


}
