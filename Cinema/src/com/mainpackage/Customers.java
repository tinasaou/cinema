package com.mainpackage;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Users {

    private String phoneNumber;
    private List<String> reservations;

    public Customers(String name, String username, String password, String phoneNumber) {
        super(name, username, password);
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    // Getters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getReservations() {
        return reservations;
    }

    // Setters
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setReservations(List<String> reservations) {
        this.reservations = reservations;
    }

    // Other methods
    public void showAvailableFilms() {
        // code to display available films
    }

    public void makeReservation(String film) {
        // code to reserve a film
        reservations.add(film);
    }

    public void viewReservation() {
        // code to display the user's reservations
    }
}


