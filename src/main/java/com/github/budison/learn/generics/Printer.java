package com.github.budison.learn.generics;

/**
 * @author Kevin Nowak
 */
class Printer <T> {

    private final T t;

    Printer(T t) {
        this.t = t;
    }

    void print() {
        System.out.println(t);
    }
}
