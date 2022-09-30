package com.github.budison.learn.streams;

import java.util.Arrays;

/**
 * @author Kevin Nowak
 */
class ArrayStream {

    public static void main(String[] args) {

        // Stream from Array, sort, filter and print
        String[] names = {"Cristiano", "Lionel", "Paul", "Antoine", "Marcus", "Sergio", "Karim", "David", "Vinicius"};

        Arrays.stream(names)        // same as Stream.of(names)
                .filter(name -> name.startsWith("S"))
                .sorted()
                .forEach(System.out::println);


    }
}
