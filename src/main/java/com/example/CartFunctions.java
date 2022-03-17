package com.example;

import java.util.function.Function;

public class CartFunctions {
    public static final Function<Cart,Double> MULTIPLY_WITH_ONE_POINT_FIVE = o -> o.value() * 1.5;
    public static final Function<Cart,Double> MULTIPLY_WITH_TWO_POINT_FIVE = o -> o.value() * 2.5;
    public static final Function<Cart,Double> DEFAULT = o -> {return 1.5;};
}
