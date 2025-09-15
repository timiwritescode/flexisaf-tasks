package com.flexisaf_internship.task1;

import java.util.List;
import java.util.function.Predicate;


/**
 * Class provides util method for counting
 * the population of a collection that satisfies a
 * particular condition
 *
 */
public class CounterUtil {

    public static <T> long count(List<T> collection, Predicate<T> condition) {
        return collection.stream()
                .filter(condition)
                .count();
    }


}
