package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int id;
    private Date date;
    private List<OrderItem> items;
}
