package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {


    private int flightId;

    private String nif;

    private String name;

    private String surname;

    private String email;

    private int seatNumber;

    private List<Luggage> luggages;


}