package com.github.budison.learn.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class StreamFromFile {

    public static void main(String[] args) {

        // Stream rows from text file --> sort, filter and print
        try (Stream<String> streamOfBands = Files.lines(Paths.get("src/main/resources/bands.txt"))) {
            streamOfBands
                    .sorted()
                    .filter(band -> band.length() > 13)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }
    }
}
