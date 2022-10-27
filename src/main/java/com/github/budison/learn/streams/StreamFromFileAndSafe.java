package com.github.budison.learn.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class StreamFromFileAndSafe {

    public static void main(String[] args) {

        // Stream rows from text file --> save to List
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/bands.txt"))) {
            List<String> bandNamesWithJit = stream
                    .filter(bandName -> bandName.contains("jit"))
                    .toList();
            bandNamesWithJit.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }
    }
}
