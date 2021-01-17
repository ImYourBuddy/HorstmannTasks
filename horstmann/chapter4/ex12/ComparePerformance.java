package com.mycompany.horstmann.chapter4.ex12;

import com.mycompany.firsttask.shapes.Circle;

import java.lang.reflect.Method;

public class ComparePerformance {
    public static void main(String[] args) {
        long startCall;
        long endCall;
        Circle testCircle = new Circle(3.3, "green");
        startCall = System.nanoTime();
        testCircle.getArea();
        endCall = System.nanoTime();
        System.out.println("Regular call = " + (endCall - startCall));
        startCall = System.nanoTime();
        Method circleMethod = null;
        /*
        In order not to increase the working time, i don't use null check.
         */
        try {
            circleMethod = Circle.class.getMethod("getArea", null);
            circleMethod.invoke(testCircle, null);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        endCall = System.nanoTime();
        System.out.println("Reflection call = " + (endCall - startCall)); // More expensive than regular call

    }
}
