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
        if (o == null || !(o instanceof DiscountItem)) return false;
        if (!super.equals(o)) return false;
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

    public static void main(String[] args) {
        Item item1 = new Item("Test item", 10.0);
        Item item2 = new Item("Test item", 10.0);
        DiscountItem discountItem1 = new DiscountItem("Test item",10.0, 0.1);
        DiscountItem discountItem2 = new DiscountItem("Test item",10.0, 0.1);
        //Symmetry
        System.out.println(item1.equals(item2));
        System.out.println(item2.equals(item1));
        System.out.println(discountItem1.equals(discountItem2));
        System.out.println(discountItem2.equals(discountItem1));
        //Transitive
        System.out.println(item1.equals(discountItem1));
        System.out.println(discountItem1.equals(discountItem2));
        System.out.println(item1.equals(discountItem2));
    }
}
