package com.mycompany.horstmann.chapter4.ex11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HelloReflection {
    public static void main(String[] args) {
        Field field = null;
        Method method = null;
        try {
            field = System.class.getField("out");
            method = field == null ? null : field.getType().getMethod("println", String.class);
            if (method != null) {
                method.invoke(field.get(null), "Hello, World!");
            }
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
