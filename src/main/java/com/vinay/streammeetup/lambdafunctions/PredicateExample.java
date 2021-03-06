package com.vinay.streammeetup.lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Smith","Sye", "Samueal", "Catley", "Sie");
        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
        names.stream().filter(nameStartsWithS).forEach(System.out::println);
        names.stream().filter(nameStartsWithS.negate()).forEach(System.out::println);

    }
}
