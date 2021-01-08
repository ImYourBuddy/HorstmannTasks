package com.mycompany.horstmann.chapter3.ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bob");
        strings.add("James");
        strings.add("Max");
        strings.add("Alice");
        System.out.println(strings);
        luckySort(strings, (x, y) -> x.compareTo(y));
        System.out.println(strings);

    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comparator) {
        ArrayList<String> template = new ArrayList<>(strings);
        Collections.sort(template);
        while (!strings.equals(template)) {
            Collections.shuffle(strings);
        }
    }
}
