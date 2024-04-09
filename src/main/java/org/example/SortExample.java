package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortExample {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("Juan", "María", "Carlos", "Carlos").stream();
        // Ordenará los String en orden alfabético
        List<String> sortedNames = stream
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
