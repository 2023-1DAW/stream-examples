package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class SumExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4).stream();

        // Ordenará los String en orden alfabético
        Integer totalSum = stream
                .reduce(
                        0,
                        (n1, n2) -> n1 + n2
                );
        System.out.println(totalSum);
    }
}
