package com.flexisaf_internship.java_collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorUtilTest {

    @Test
    void testRemoveElementsByCondition() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "egg", "cherry", "fig"));

        IteratorUtil.performOperation(words, (iterator, word) -> {
            if (word.length() < 4) {
                iterator.remove();
            }
        });

        assertEquals(Arrays.asList("apple", "banana", "cherry"), words);
    }

    @Test
    void testModifyElementsInPlace() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        IteratorUtil.performOperation(words, (iterator, word) -> {
            int index = words.indexOf(word);
            words.set(index, word.toUpperCase());
        });

        assertEquals(Arrays.asList("APPLE", "BANANA", "CHERRY"), words);
    }

    @Test
    void testCollectElementsToAnotherList() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        List<String> collected = new ArrayList<>();

        IteratorUtil.performOperation(words, (iterator, word) -> {
            if (word.contains("a")) {
                collected.add(word);
            }
        });

        assertEquals(Arrays.asList("apple", "banana"), collected);
    }

    @Test
    void testNoOpOperationKeepsListUnchanged() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        IteratorUtil.performOperation(numbers, (iterator, number) -> {

        });

        assertEquals(Arrays.asList(1, 2, 3, 4, 5), numbers);
    }

    @Test
    void testRemoveAllElements() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        IteratorUtil.performOperation(numbers, (iterator, number) -> iterator.remove());

        assertTrue(numbers.isEmpty());
    }

    @Test
    void testComplexOperationRemoveAndModify() {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "egg", "cherry"));

        IteratorUtil.performOperation(words, (iterator, word) -> {
            if (word.length() < 4) {
                iterator.remove();
            } else {
                int index = words.indexOf(word);
                words.set(index, word.substring(0, 1).toUpperCase() + word.substring(1));
            }
        });

        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), words);
    }
}
