package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class FIlterExample {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("Juan", "María", "Carlos")
                .stream();

        stream
                // Esta lambda (String) -> Boolean, comprueba que el parámetro nombre empieza por J
                .filter(nombre -> nombre.startsWith("J"))
                // Muestra todos los elementos del stream resultante usando una lambda (String) -> Void
                .forEach(System.out::println);
    }
}
