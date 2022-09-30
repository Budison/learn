package com.github.budison.learn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kevin Nowak
 */
class ReutersInterviewQuestion {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("Ann", "Paul", "Bob", "Mark", "John", "Frank", "Paul");

        // Remove duplicates and sort in reversed alphabetical order
        List<String> output = data.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Before: " + data);
        System.out.println("After: " + output);
    }
}
