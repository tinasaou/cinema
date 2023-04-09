package com.mainpackage;

import java.util.ArrayList;
import java.util.List;

public class ContentAdmins extends Users {
    // Attributes
    private List<Films> films;
    private List<Cinemas> cinemas;

    // Constructor
    public ContentAdmins(String name, String username, String password) {
        super(name, username, password);
        this.films = new ArrayList<>();
        this.cinemas = new ArrayList<>();
    }

    // Getters and setters
    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    public List<Cinemas> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinemas> cinemas) {
        this.cinemas = cinemas;
    }

    // Methods
    public void insertFilm(Films film) {
        films.add(film);
    }

    public void deleteFilm(Films film) {
        films.remove(film);
    }

    public void assignFilmToCinema(Films film, Cinemas cinema) {
        cinema.addFilm(film);
    }
}

