package com.mycompany.horstmann.chapter1.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    public static void printCombination() {
        List<Integer> numbersForCombination = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            numbersForCombination.add(i);
        }
        List<Integer> combination = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 6; i++) {
            index = new Random().nextInt(48 - i);
            combination.add(numbersForCombination.get(index));
            numbersForCombination.remove(index);
        }
        Collections.sort(combination);
        System.out.println(combination);
    }
}
