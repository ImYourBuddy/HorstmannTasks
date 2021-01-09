package com.mycompany.horstmann.chapter4.ex9;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ToStringReflection {
    public static String toString(Object object) {
        StringBuilder result = new StringBuilder("{");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                if (f.getType().isArray()) {
                    result.append(f.getName() + "[");
                    for (int i = 0; i < Array.getLength(f.get(object)); i++) {
                        result.append(toString(Array.get(f.get(object), i)) + ", ");
                    }
                    result.delete(result.length() - 2, result.length());
                    result.append("], ");
                } else {
                    result.append(f.getName() + " = " + f.get(object) + ", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }
}
