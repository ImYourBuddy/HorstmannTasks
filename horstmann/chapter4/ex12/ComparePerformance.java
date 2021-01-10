package com.mycompany.horstmann.chapter4.ex12;

import com.mycompany.firsttask.shapes.Circle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ComparePerformance {
    public static void main(String[] args) {
        long startCall;
        long endCall;
        Circle testCircle = new Circle(3.3, "green");
        Method circleMethod = null;
        try {
             circleMethod = Circle.class.getMethod("getArea", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        startCall = System.nanoTime();
        testCircle.getArea();
        endCall = System.nanoTime();
        System.out.println("Regular call = " + (endCall - startCall));
        startCall = System.nanoTime();
        try {
            circleMethod.invoke(testCircle, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        endCall = System.nanoTime();
        System.out.println("Reflection call = " + (endCall - startCall)); // More expensive than regular call

    }
}
