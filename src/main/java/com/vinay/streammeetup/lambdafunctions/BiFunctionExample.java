package com.vinay.streammeetup.lambdafunctions;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" +(num1 + num2);
        System.out.println(biFunction.apply(20,25));

    }
}
