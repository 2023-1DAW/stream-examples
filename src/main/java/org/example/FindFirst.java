package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("Juan", "María", "Carlos", "Carlos").stream();
        // Stream<String> stream = new ArrayList<String>().stream();
        // Ordenará los String en orden alfabético
        Optional<String> allNames = stream
                .distinct()
                .sorted()
                .findFirst();

        if(allNames.isPresent()) {
            System.out.println(allNames.get());
        } else {
            System.out.println("No hay valores");

        }

    }
}
