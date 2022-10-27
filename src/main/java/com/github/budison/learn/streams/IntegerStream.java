package com.github.budison.learn.streams;

import java.util.stream.IntStream;

/**
 * @author Kevin Nowak
 */
class IntegerStream {

    public static void main(String[] args) {

        // Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);    // same as .forEach(x -> System.out.print(x));
        System.out.println();

        // Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
        System.out.println();

        // Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );
    }
}
