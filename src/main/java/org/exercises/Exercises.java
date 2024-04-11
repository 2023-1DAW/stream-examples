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

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println("El primero es " + first(numbers));
    }

    public static <T> T first(List<T> names) {
        Optional<T> firstNameOpt = names
                .stream()
                .findFirst();

        return firstNameOpt.orElse(null);
    }

}
