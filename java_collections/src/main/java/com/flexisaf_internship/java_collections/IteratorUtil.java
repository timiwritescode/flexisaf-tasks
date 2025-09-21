package com.flexisaf_internship.java_collections;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class IteratorUtil {
    public static <T> List<T> performOperation(List<T> iterable, BiConsumer<Iterator<T>, T> operation) {
        Iterator<T> iterator = iterable.iterator();

        while(iterator.hasNext()) {
            T element = iterator.next();
            operation.accept(iterator, element);
        }

        return  iterable;
    }
}