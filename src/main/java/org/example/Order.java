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

    public Double getPrice() {
        return items
                .stream()
                // Calculo el precio por item
                .map(orderItem -> orderItem.getPricePerUnit() * orderItem.getUnits())
                // Sumo los precios de todos los item, si no hay items devolvera 0
                .reduce(0d, (price1, price2) -> price1 + price2);
    }
}
