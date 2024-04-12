package org.example;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        Optional<String> optionalMessage = Optional.of("Hola");

        // Muestra el mensaje porque optionalMessage no es empty
        optionalMessage.ifPresent(message -> System.out.println("Msg: " + message));

        Optional<String> optionalEmptyMessage = Optional.empty();
        // No hace nada porque optionalEmptyMessage es empty
        optionalEmptyMessage.ifPresent(message -> System.out.println("Msg: " + message));


        // message1 es Hola, porque optionalMessage no está vacío
        var message1 = optionalMessage.orElse("Hello");
        System.out.println(message1);

        // message2 es Hello, porque optionalEmptyMessage está vacío
        var message2 = optionalEmptyMessage.orElse("Hello");
        System.out.println(message2);

        // message1 es Hola, porque optionalMessage no está vacío
        var getMessage1 = optionalMessage.get();

        // Lanza la excepción NoSuchElementException optionalEmptyMessage está vacío
        // var getMessage2 = optionalEmptyMessage.get();

        // Devuelve un Optional<Integer> que contiene el valor 4
        Optional<Integer> lengthOpt1 = optionalMessage.map(message -> message.length());
        System.out.println(lengthOpt1);
        // Devuelve un Optional<Integer> vacío, porque optionalEmptyMessage está vacío
        Optional<Integer> lengthOpt2 = optionalEmptyMessage.map(message -> message.length());
        System.out.println(lengthOpt2);
    }
}
