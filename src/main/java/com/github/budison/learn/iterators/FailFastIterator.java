package com.github.budison.learn.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Kevin Nowak
 */
class FailFastIterator {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        Iterator<Integer> iterator = numbers.iterator();

//        This will cause a ConcurrentModificationException:
//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//            numbers.add(60);
//        }

//        This will cause a ConcurrentModificationException as well:
//        while (iterator.hasNext()) {
//            if (iterator.next() == 30) {
//                numbers.remove(30);
//            }
//        }

//      Removing element using iterator.remove(), which won't cause a ConcurrentModificationException
        while (iterator.hasNext()) {
            if (iterator.next() == 30) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
