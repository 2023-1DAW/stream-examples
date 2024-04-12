package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        // Stream<String> stream = Arrays.asList("Juan", "María", "Carlos", "Carlos").stream();
        Stream<String> stream = new ArrayList<String>().stream();
        // Ordenará los String en orden alfabético
        String allNames = stream
                .distinct()
                .sorted()
                .reduce((n1, n2) -> n1 + ", " + n2)
                .orElse("");

        System.out.println(allNames);
        var nombresMayusculas = stream
                // Lambda de tipo (String) -> String
                .map(
                        nombre -> {
                            String upper = nombre.toUpperCase();
                            return upper;
                        }
                );
        // Ejemplo de uso de forEach para concatenar los nombres separados por comas
        Stream<String> names = Arrays.asList("Juan", "María", "Carlos").stream();
        final StringBuilder sentence = new StringBuilder();

        names.forEach(v -> sentence.append(" " + v));

        System.out.println(sentence.toString());
    }
}
