package com.mycompany.horstmann.chapter4.ex1_ex2_ex3;


public class ProtectedPoint {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("Test point", 10.1, 2.3);
        System.out.println(labeledPoint.x);
        System.out.println(labeledPoint.y);
    }
}
