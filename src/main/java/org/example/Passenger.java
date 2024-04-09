package org.example;

import java.util.List;

public class Passenger {


    private int flightId;

    private String nif;

    private String name;

    private String surname;

    private String email;

    private int seatNumber;

    private List<Luggage> luggages;

    public Passenger(int flightId, String nif, String name, String surname, String email, int seatNumber, List<Luggage> luggages) {
        this.flightId = flightId;
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.seatNumber = seatNumber;
        this.luggages = luggages;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public List<Luggage> getLuggages() {
        return luggages;
    }

    public void setLuggages(List<Luggage> luggages) {
        this.luggages = luggages;
    }
}