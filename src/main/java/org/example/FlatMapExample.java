package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        passengers
                .stream()
                .filter(p -> p.getFlightId() == 1)
                .flatMap(passenger -> passenger.getLuggages().stream())
                .forEach(System.out::println);
    }
}
