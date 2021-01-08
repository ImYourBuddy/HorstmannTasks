package com.mycompany.horstmann.chapter3.ex1andex2;

public interface Measurable {
    double getMeasure();
    double average(Measurable[] objects);
    Measurable largest(Measurable[] objects);
}
