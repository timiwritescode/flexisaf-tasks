package com.flexisaf_internship.task1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CounterUtilTest {

    @Test
    void testCountEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        long count = CounterUtil.count(numbers, n -> n % 2 == 0);
        assertEquals(3, count);
    }

    @Test
    void testCountGreaterThanThree() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        long count = CounterUtil.count(numbers, n -> n > 3);
        assertEquals(3, count);
    }

    @Test
    void testCountEmptyList() {
        List<Integer> numbers = List.of();
        long count = CounterUtil.count(numbers, n -> n > 0);
        assertEquals(0, count);
    }

    @Test
    void testCountNoMatch() {
        List<String> words = List.of("apple", "banana", "cherry");
        long count = CounterUtil.count(words, w -> w.startsWith("z"));
        assertEquals(0, count);
    }

    @Test
    void testCountAllMatch() {
        List<String> words = List.of("apple", "apricot", "avocado");
        long count = CounterUtil.count(words, w -> w.startsWith("a"));
        assertEquals(3, count);
    }

    @Test
    void testCountWithSet() {
        Set<String> words = new HashSet<>(Arrays.asList("apple", "banana", "pear", "plum"));
        long count = CounterUtil.count(words, w -> w.length() > 4);
        assertEquals(2, count);
    }

    @Test
    void testCountWithQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 25, 30, 35));
        long count = CounterUtil.count(queue, n -> n % 5 == 0);
        assertEquals(5, count);
    }
}
