package org.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercises {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Peppa");

        names
                .stream()
                .forEach(System.out::println);

        System.out.println("El primero es " + first(names));
    }

    public static String first(List<String> names) {
        Optional<String> firstNameOpt = names
                .stream()
                .findFirst();

        return firstNameOpt.orElse(null);
    }

}
