package com.vinay.streammeetup.stream.java9improvements;

import java.util.stream.IntStream;

public class IterateExample {
    public static void main(String[] args) {
        IntStream.iterate(1, num -> num < 30, num -> num*3).forEach(num ->System.out.println(num));

    }
}
