package com.mycompany.horstmann.chapter4.ex11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloReflection {
    public static void main(String[] args) {
        Field field = null;
        try {
            field = System.class.getField("out");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        Method method = null;
        try {
            method = field.getType().getMethod("println", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (method != null) {
            try {
                method.invoke(field.get(null), "Hello, World!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }
}
