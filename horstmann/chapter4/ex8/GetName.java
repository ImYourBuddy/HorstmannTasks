package com.mycompany.horstmann.chapter4.ex8;

import com.mycompany.firsttask.shapes.Circle;

import java.util.ArrayList;

public class GetName {
    public static void main(String[] args) {
        Circle justAClass = new Circle(1.0, "red");
        double[] array = new double[]{1.0, 1.1, 1.2};
        GetName.Inner inner = new GetName().new Inner();
        ArrayList<String> genericClass = new ArrayList<>();
        class Local {
            private String inf = "local";
        }

        System.out.println("getName()");
        System.out.println("Just a class: " + justAClass.getClass().getName());
        System.out.println("Inner class: " + inner.getClass().getName());
        System.out.println("Generic class: " + genericClass.getClass().getName());
        System.out.println("Local: " + Local.class.getName());
        System.out.println("Array: " + array.getClass().getName());
        System.out.println("Primitive: " + int.class.getName());
        System.out.println();

        System.out.println("getCanonicalName()");
        System.out.println("Just a class: " + justAClass.getClass().getCanonicalName());
        System.out.println("Inner class: " + inner.getClass().getCanonicalName());
        System.out.println("Generic class: " + genericClass.getClass().getCanonicalName());
        System.out.println("Local: " + Local.class.getCanonicalName());
        System.out.println("Array: " + array.getClass().getCanonicalName());
        System.out.println("Primitive: " + int.class.getCanonicalName());
        System.out.println();

        System.out.println(" getSimpleName()");
        System.out.println("Just a class: " + justAClass.getClass().getSimpleName());
        System.out.println("Inner class: " + inner.getClass().getSimpleName());
        System.out.println("Generic class: " + genericClass.getClass().getSimpleName());
        System.out.println("Local: " + Local.class.getSimpleName());
        System.out.println("Array: " + array.getClass().getSimpleName());
        System.out.println("Primitive: " + int.class.getSimpleName());
        System.out.println();

        System.out.println("getTypeName()");
        System.out.println("Just a class: " + justAClass.getClass().getTypeName());
        System.out.println("Inner class: " + inner.getClass().getTypeName());
        System.out.println("Generic class: " + genericClass.getClass().getTypeName());
        System.out.println("Local: " + Local.class.getTypeName());
        System.out.println("Array: " + array.getClass().getTypeName());
        System.out.println("Primitive: " + int.class.getTypeName());
        System.out.println();

        System.out.println("toString()");
        System.out.println("Just a class: " + justAClass.getClass().toString());
        System.out.println("Inner class: " + inner.getClass().toString());
        System.out.println("Generic class: " + genericClass.getClass().toString());
        System.out.println("Local: " + Local.class.toString());
        System.out.println("Array: " + array.getClass().toString());
        System.out.println("Primitive: " + int.class.toString());
        System.out.println();

        System.out.println("toGenericString()");
        System.out.println("Just a class: " + justAClass.getClass().toGenericString());
        System.out.println("Inner class: " + inner.getClass().toGenericString());
        System.out.println("Generic class: " + genericClass.getClass().toGenericString());
        System.out.println("Local: " + Local.class.toGenericString());
        System.out.println("Array: " + array.getClass().toGenericString());
        System.out.println("Primitive: " + int.class.toGenericString());
        System.out.println();
    }
    public class Inner {
        private String inf = "Inner";
    }
}
