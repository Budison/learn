package com.github.budison.learn.iterators;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Kevin Nowak
 */
class FailSafeIterator {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        System.out.println("before: " + map);

        Iterator<String> iterator = map.keySet().iterator();

        int i = 1;

        while (iterator.hasNext()) {
            String key = iterator.next();
            map.put(key, i++);
        }

        System.out.println("after:  " + map);
    }
}
