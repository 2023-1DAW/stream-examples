package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        // En este caso tenemos un  Stream para el que la A es String
        Stream<String> stream = Arrays.asList("Juan", "María", "Carlos").stream();
        // El mapeo genera un Stream<Integer> que luego es recolectado en una List<Ingeger>
        stream
                // Transformamos cada nombre en el número de caracteres que lo componen
                // (A) -> B
                // La lambda que se aplica es String -> Integer
                // Este map devuelve un Stream<Integer>
                .map((nombre) -> nombre.length())
                .map(length -> length + 1)
                // Ahora ejecutamos una operación terminal para que muestre todos los elementos del stream resultante
                .forEach(System.out::println);
    }
}
