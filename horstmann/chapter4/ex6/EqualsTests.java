package com.mycompany.horstmann.chapter4.ex6;

public class EqualsTests {
    public static void main(String[] args) {
        Item item1 = new Item("Test item", 10.0);
        DiscountItem discountItem1 = new DiscountItem("Test item",10.0, 0.1);
        DiscountItem discountItem2 = new DiscountItem("Test item",10.0, 0.2);

        System.out.println("Symmetry:");
        System.out.println(item1.equals(discountItem1));
        System.out.println(discountItem1.equals(item1));
        System.out.println();
        System.out.println("Transitive:");
        System.out.println(discountItem1.equals(item1));
        System.out.println(item1.equals(discountItem2));
        System.out.println(discountItem1.equals(discountItem2));
    }
}
