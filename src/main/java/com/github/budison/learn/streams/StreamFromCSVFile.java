package com.github.budison.learn.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class StreamFromCSVFile {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/data.csv");

        // Stream rows from CSV file --> count
        try (Stream<String> streamOfRows = Files.lines(path)) {
            long rowCount = streamOfRows
                    .map(row -> row.split(","))
                    .filter(row -> row.length == 3)
                    .count();
            System.out.println("rowCount=" + rowCount);
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }

        // Stream rows from CSV file --> count all second values which are over 15
        try (Stream<String> streamOfRows = Files.lines(path)) {
            long over15Count = streamOfRows
                    .map(row -> row.split(","))
                    .filter(row -> row.length == 3)
                    .filter(row -> Integer.parseInt(row[1]) > 15)
                    .count();
            System.out.println("over15Count=" + over15Count);
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }

        // Stream rows from CSV file --> print all the data from the row
        try (Stream<String> streamOfRows = Files.lines(path)) {
            streamOfRows
                    .map(row -> row.split(","))
                    .filter(row -> row.length == 3)
                    .filter(row -> Integer.parseInt(row[1]) > 15)
                    .forEach(row -> System.out.println(row[0] + " " + row[1] + " " + row[2]));
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }

        // Stream rows from CSV file --> store fields in HashMap
        try (Stream<String> streamOfRows = Files.lines(path)) {
            Map<String, Integer> map = streamOfRows
                    .map(row -> row.split(","))
                    .filter(row -> row.length == 3)
                    .collect(Collectors.toMap(
                            key -> key[0],
                            value -> Integer.parseInt(value[1])
                    ));
            map.forEach((k, v) -> System.out.println(k + " " + v));
        } catch (IOException e) {
            System.err.println("I/O error occurred");
        }
    }
}
