package com.mycompany.horstmann.chapter3.ex4andex5;

public interface Sequence {
    default boolean hasNext(){
        return true;
    }
    int next();
}
