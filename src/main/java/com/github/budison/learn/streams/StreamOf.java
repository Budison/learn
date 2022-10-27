package com.github.budison.learn.streams;

import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class StreamOf {

    public static void main(String[] args) {

        // Stream.of --> sort and print first element of this stream
        Stream.of("Ava", "Antony", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // Now with empty stream --> still compiles
        Stream.of()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
