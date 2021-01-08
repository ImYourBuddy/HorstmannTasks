package com.mycompany.horstmann.chapter3.ex1andex2;

public class Employee implements Measurable {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, double salary) {
        this(salary);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public double average(Measurable[] objects) {
        double averageValue = 0;
        for (Measurable employee : objects) {
            averageValue += employee.getMeasure();
        }
        averageValue /= objects.length;
        return averageValue;
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        Employee highestPaid = new Employee(Double.MIN_VALUE);
        for (Measurable employee : objects) {
            if (employee instanceof Employee) {
                if (employee.getMeasure() > highestPaid.getMeasure()) {
                    highestPaid =(Employee) employee;
                }
            } else {
                continue;
            }
        }
        return highestPaid;
    }
}
