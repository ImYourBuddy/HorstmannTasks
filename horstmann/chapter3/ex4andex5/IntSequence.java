package com.mycompany.horstmann.chapter3.ex4andex5;

import java.util.NoSuchElementException;

public class IntSequence implements Sequence {
    private int number;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        int next = number;
        number++;
        return next;
    }

    public static Sequence of(int ... values) {
        Sequence sequence = new Sequence() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < values.length;
            }

            @Override
            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("There are no items in sequence");
                }
                int next = values[counter];
                counter++;
                return next;
            }
        };
        return sequence;
    }

    public static Sequence constant(int value) {
        return () -> value;
    }
}
