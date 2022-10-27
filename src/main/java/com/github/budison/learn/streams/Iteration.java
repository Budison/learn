package com.github.budison.learn.streams;

import java.util.List;

/**
 * @author Kevin Nowak
 */
class Iteration {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

        long count = list.stream()
                .filter(integer -> integer > 2)
                .count();

        System.out.println("count = " + count);
    }
}
