package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class RuleMatrix {
    private static Map<Predicate, Function> ruleMatrix = new HashMap<>();

    static {
        ruleMatrix.put(CartPredicates.WHEN_CART_VALUE_IS_SIX, CartFunctions.MULTIPLY_WITH_ONE_POINT_FIVE);
        ruleMatrix.put(CartPredicates.WHEN_CART_VALUE_IS_SEVEN, CartFunctions.MULTIPLY_WITH_TWO_POINT_FIVE);
    }

    public static Map<Predicate, Function> getRules() {
        return ruleMatrix;
    }
}
