package com.example;

public class Main {
    public static void main(String[] args) {
        Cart cart6 = new Cart(6.0);
        Cart cart7 = new Cart(7.0);
        Cart cart17 = new Cart(17.0);

        System.out.println("Replacing IF-ELSE IF way: ");

        Rules<Cart> rules = new Rules<>();
        System.out.println("Cart 6 -- " + rules.getRule(RuleMatrix.getRules(), cart6).apply(cart6));
        System.out.println("Cart 7 -- " + rules.getRule(RuleMatrix.getRules(), cart7).apply(cart6));
        System.out.println("Cart 17 -- " + rules.getRule(RuleMatrix.getRules(), cart17).apply(cart6));

        System.out.println("Old way: ");

        System.out.println("(old way) Cart 6 -- " + cartCalc(cart6));
        System.out.println("(old way) Cart 7 -- " + cartCalc(cart7));
        System.out.println("(old way) Cart 17 -- " + cartCalc(cart17));
    }

    public static Double cartCalc(Cart cart) {
        Double result = 1.5;
        if (cart.value() == 6.0) {
            result = cart.value() * 1.5;
        } else if (cart.value() == 7.0) {
            result = cart.value() * 2.5;
        }
        return result;
    }
}
