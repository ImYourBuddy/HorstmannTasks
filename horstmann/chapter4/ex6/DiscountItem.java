package com.mycompany.horstmann.chapter4.ex6;

import java.util.Objects;

public class DiscountItem extends Item {
    private double discount;

    public DiscountItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!super.equals(o)) return false;
        if (Item.class == o.getClass()) return true;
        if (!(getClass() == o.getClass())) return false;
        DiscountItem that = (DiscountItem) o;
        boolean discountEquals = (Math.abs(discount - that.discount) < 0.000001);
        return discountEquals;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = super.hashCode();
        result = 31 * result + Double.hashCode(discount);
        return result;
    }
}
