package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private Set<String> tags;

}
