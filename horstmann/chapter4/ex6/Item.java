package com.mycompany.horstmann.chapter4.ex6;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Item)) return false;
        Item item = (Item) o;
        boolean priceEquals = (Math.abs(price - item.price) < 0.000001);
        boolean descriptionEquals = (description == null && item.description == null)
                || (description != null && description.equals(item.description));
        return priceEquals && descriptionEquals;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + (description == null ? 0 : description.hashCode());
        return result;
    }
}
