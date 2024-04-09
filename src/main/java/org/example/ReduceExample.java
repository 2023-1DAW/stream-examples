package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        //Stream<String> stream = Arrays.asList("Juan", "María", "Carlos", "Carlos").stream();
       Stream<String> stream = new ArrayList<String>().stream();
        // Ordenará los String en orden alfabético
        Optional<String> allNames = stream
                .distinct()
                .sorted()
                .reduce((n1, n2) -> n1  + ", " + n2);

        if(allNames.isPresent()) {
            System.out.println(allNames.get());
        } else {
            System.out.println("No hay valores");

        }

    }
}
