package org.example;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = 0;
        for(int number: numeros) {
            if(number % 0 == 0) {
                int number2 = number *2;
                sum += number2;
            }
        }

        var res = numeros.stream()
                .filter((number) -> number % 2 == 0)  // Filtrar números pares
                .map((n) -> n * 2)           // Duplicar cada número
                .reduce((a,b) -> a + b);  // Imprimir los resultados
    }
}