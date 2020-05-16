package com.vinay.streammeetup.stream.java9improvements;

import java.util.stream.Stream;

public class TakeWhileExample {

    public static void main(String[] args) {
        Stream<Integer> orderedStream = Stream.of(10, 20, 30, 40, 60, 90, 120);
        orderedStream.takeWhile(num -> num < 50).forEach(num -> System.out.println(num));
        Stream<Integer> unOrderedStream = Stream.of(10, 20, 40, 60, 70, 10, 15, 100);
        unOrderedStream.takeWhile(num -> num < 50).forEach(num -> System.out.println(num));
    }
}
