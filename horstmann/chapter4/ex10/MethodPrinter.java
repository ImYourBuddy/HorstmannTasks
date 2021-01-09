package com.mycompany.horstmann.chapter4.ex10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MethodPrinter {
    public static void main(String[] args) {
        try {
            printer(int[].class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void printer(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        while (clazz != null) {
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(method.getModifiers()) + " " +
                                method.getReturnType().getCanonicalName() + " " +
                                method.getName() +
                                Arrays.toString(method.getParameters()));
            }
            clazz  = clazz.getSuperclass();
        }
    }
}
