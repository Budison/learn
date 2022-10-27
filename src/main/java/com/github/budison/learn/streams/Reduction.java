package com.github.budison.learn.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class Reduction {

    public static void main(String[] args) {

        // Reduce
        double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, Double::sum);
        System.out.println("total=" + total);

        // Summary
        IntSummaryStatistics summaryStatistics = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
        System.out.println(summaryStatistics);
    }
}
