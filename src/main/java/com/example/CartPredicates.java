package com.example;

import java.util.function.Predicate;

public class CartPredicates {
    public static final Predicate<Cart> WHEN_CART_VALUE_IS_SIX = cart -> cart.value() == 6;
    public static final Predicate<Cart> WHEN_CART_VALUE_IS_SEVEN = cart -> cart.value() == 7;
}
