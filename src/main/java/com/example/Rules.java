package com.example;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Rules<T> {
    public Function getRule(Map<Predicate, Function> ruleMatrix, T t) {
        return ruleMatrix
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().test(t))
                .map(entry -> entry.getValue())
                .findFirst()
                .orElse(CartFunctions.DEFAULT);
    }
}
