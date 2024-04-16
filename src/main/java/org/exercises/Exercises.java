package org.exercises;

import org.example.Order;
import org.example.OrderItem;
import org.example.Student;

import java.util.*;
import java.util.stream.Collectors;

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


    public static List<String> mapToEmails(List<Student> students) {
        return students
                .stream()
                .map(student -> student.getEmail())
                .collect(Collectors.toList());
    }

    public static List<Student> filterByZipCode(List<Student> students, int zipCode) {
        return students
                .stream()
                .filter(student -> student.getZipCode() == zipCode)
                .collect(Collectors.toList());
    }

    public static double sum(List<Double> numbers) {
        return numbers
                .stream()
                .reduce(0d, (a, b) -> a + b);
    }

    public static Optional<Double> average(List<Double> numbers) {
        return numbers
                .stream()
                .reduce((a, b) -> a + b)
                .map(sum -> sum / numbers.size());
    }

    public static Optional<Double> max(List<Double> numbers) {
        return numbers
                .stream()
                .max((a, b) -> a.compareTo(b));
    }

    public static Optional<Double> min(List<Double> numbers) {
        return numbers
                .stream()
                .min((a, b) -> a.compareTo(b));
    }


    public static boolean areBiggerThan100(List<Double> numbers) {
        return numbers.stream().allMatch(n -> n > 100);
    }

    public static boolean someBiggerThan100(List<Double> numbers) {
        return numbers.stream().anyMatch(n -> n > 100);
    }

    public static boolean noneBiggerThan100(List<Double> numbers) {
        return numbers.stream().noneMatch(n -> n > 100);
    }

    public List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        Set<Double> numbers2Set = new HashSet<>(numbers2);
        return numbers1
                .stream()
                .filter(number -> numbers2Set.contains(number))
                .collect(Collectors.toList());
    }

    public List<Double> getPrices(List<Order> orders) {
        return orders.stream()
                .map(order -> order.getPrice())
                .collect(Collectors.toList());
    }

    public Double getPrice(List<Order> orders) {
        return orders.stream()
                .map(order -> order.getPrice())
                .reduce(0d, (p1, p2) -> p1 + p2);
    }

    public List<OrderItem> getItems(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.toList());
    }
}
