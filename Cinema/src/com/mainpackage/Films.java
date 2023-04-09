package com.mainpackage;

public class Films {
    private int filmId;
    private String filmTitle;
    private String filmCategory;
    private String filmDescription;

    // Constructor με όλα τα attributes
    public Films(int filmId, String filmTitle, String filmCategory, String filmDescription) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmCategory = filmCategory;
        this.filmDescription = filmDescription;
    }

    // Getters και Setters για τα attributes
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }
}

