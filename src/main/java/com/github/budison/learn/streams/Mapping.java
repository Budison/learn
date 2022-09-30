package com.github.budison.learn.streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class Mapping {

    public static void main(String[] args) {

        // Example 1
        List<String> uris = new ArrayList<>();
        uris.add("src/main/resources/data.txt");
        Stream<Path> pathStream = uris.stream().map(Paths::get);
        System.out.println(pathStream.toList());

        // Example 2
        List<String> letters = Arrays.asList("a", "b", "c", "d");
        System.out.println(letters);
        List<String> lettersUpperCase = letters.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(lettersUpperCase);

        // Example 3 - Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(integer -> integer * integer)
                .average()
                .ifPresent(System.out::println);
    }
}
