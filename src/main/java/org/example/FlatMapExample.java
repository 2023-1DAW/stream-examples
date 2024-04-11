package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        // En este caso tenemos un  Stream para el que la A es String
        var luggageBob = Arrays.asList(
                new Luggage(1, "Maleta negra"),
                new Luggage(2, "Maleta roja")
        );
        var luggagePeppa = Arrays.asList(
                new Luggage(3, "Maleta naranja"),
                new Luggage(4, "Maleta blanca")
        );
        List<Passenger> passengers = Arrays.asList(
                new Passenger(1, "32423", "Bob", "Esponja", "sdfddfs", 232, luggageBob),
                new Passenger(1, "323243", "Peppa", "Pig", "sdfddfs", 233, luggagePeppa)
        );

        // El mapeo genera un Stream<Integer> que luego es recolectado en una List<Ingeger>
        List<Product> products = Arrays.asList(
                new Product(1, "tornillo", new HashSet<>(Arrays.asList("Ferretería", "Tornillo"))),
                new Product(2, "tuerca", new HashSet<>(Arrays.asList("Ferretería", "Tuerca"))),
                new Product(3, "lápiz", new HashSet<>(Arrays.asList("Papelería")))
        );

        Set<String> tags = products
                .stream()
                .flatMap(product -> product.getTags().stream())
                .collect(Collectors.toSet());

        System.out.println(tags);
    }
}
