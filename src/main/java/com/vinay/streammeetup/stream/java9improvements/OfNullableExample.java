package com.vinay.streammeetup.stream.java9improvements;

import java.util.stream.Stream;

public class OfNullableExample {
    public static void main(String[] args) {
        Stream<String> nullValue = Stream.ofNullable(null);
        nullValue.forEach(str -> System.out.println(str));
        Stream<String> existingValue = Stream.ofNullable("Rose");
        existingValue.forEach(str -> System.out.println(str));
    }
}
