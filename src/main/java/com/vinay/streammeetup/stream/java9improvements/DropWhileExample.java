package com.vinay.streammeetup.stream.java9improvements;

import java.util.stream.Stream;

public class DropWhileExample {

    public static void main(String[] args) {
        Stream<Integer> orderedStream = Stream.of(11, 22, 40, 60, 100);
        orderedStream.dropWhile(num -> num < 50).forEach(num -> System.out.println(num));
        Stream<Integer> unOrderedStream = Stream.of(11, 22, 40, 60, 10, 15, 30, 100);
        unOrderedStream.dropWhile(num -> num < 50).forEach(num -> System.out.println(num));

    }
}
