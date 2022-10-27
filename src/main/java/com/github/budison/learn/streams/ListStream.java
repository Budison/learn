package com.github.budison.learn.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kevin Nowak
 */
class ListStream {

    public static void main(String[] args) {

        // Stream from List, filter and print
        List<String> words = List.of("refresh", "minister", "stiff", "race", "bottom", "greed", "lend");

        words.stream()
                .map(String::toLowerCase)
                .filter(word -> word.startsWith("r"))
                .forEach(System.out::println);
    }
}
