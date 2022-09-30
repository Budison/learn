package com.github.budison.learn.generics;

import java.util.List;

/**
 * @author Kevin Nowak
 */
class Main {

    public static void main(String[] args) {

        // Examples
        Printer<Integer> integerPrinter = new Printer<>(23);
        Printer<Double> doublePrinter = new Printer<>(3.1415);
        Printer<String> stringPrinter = new Printer<>("Generics are fun!");

        integerPrinter.print();
        doublePrinter.print();
        stringPrinter.print();

        // Generic method
        shout("Kevin", "John");
        shout(23, 24);
        shout(3.14, 2.71);

        // Wildcard method
        printList(List.of(10, 20, 30));
        printList(List.of(3.14, 2.71));
    }

    // Method with generic type
    private static <T, V> void shout(T t, V v) {
        System.out.println(t + " shouts at " + v);
    }

    // Wildcard example method
    private static void printList(List<? extends Number> list) {
        System.out.println(list);
    }
}
