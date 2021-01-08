package com.mycompany.horstmann.chapter3.ex1andex2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee(100), new Employee(50),
                new Employee(75)};
        System.out.println(new Employee(0).average(employees));
        System.out.println(new Employee(0).largest(employees).getMeasure());
    }
}
