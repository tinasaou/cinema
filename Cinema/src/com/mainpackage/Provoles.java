package com.mainpackage;

import java.util.Date;

public class Provoles {
    private int provoliID;
    private String provoliFilm;
    private String provoliCinema;
    private Date provoliStartDate;
    private Date provoliEndDate;
    private int provoliNumberOfReservations;
    private boolean provoliIsAvailable;

    public Provoles(int provoliID, String provoliFilm, String provoliCinema, Date provoliStartDate, Date provoliEndDate, int provoliNumberOfReservations, boolean provoliIsAvailable) {
        this.provoliID = provoliID;
        this.provoliFilm = provoliFilm;
        this.provoliCinema = provoliCinema;
        this.provoliStartDate = provoliStartDate;
        this.provoliEndDate = provoliEndDate;
        this.provoliNumberOfReservations = provoliNumberOfReservations;
        this.provoliIsAvailable = provoliIsAvailable;
    }

    public int getProvoliID() {
        return provoliID;
    }

    public void setProvoliID(int provoliID) {
        this.provoliID = provoliID;
    }

    public String getProvoliFilm() {
        return provoliFilm;
    }

    public void setProvoliFilm(String provoliFilm) {
        this.provoliFilm = provoliFilm;
    }

    public String getProvoliCinema() {
        return provoliCinema;
    }

    public void setProvoliCinema(String provoliCinema) {
        this.provoliCinema = provoliCinema;
    }

    public Date getProvoliStartDate() {
        return provoliStartDate;
    }

    public void setProvoliStartDate(Date provoliStartDate) {
        this.provoliStartDate = provoliStartDate;
    }

    public Date getProvoliEndDate() {
        return provoliEndDate;
    }

    public void setProvoliEndDate(Date provoliEndDate) {
        this.provoliEndDate = provoliEndDate;
    }

    public int getProvoliNumberOfReservations() {
        return provoliNumberOfReservations;
    }

    public void setProvoliNumberOfReservations(int provoliNumberOfReservations) {
        this.provoliNumberOfReservations = provoliNumberOfReservations;
    }

    public boolean isProvoliAvailable() {
        return provoliIsAvailable;
    }

    public void setProvoliAvailable(boolean provoliIsAvailable) {
        this.provoliIsAvailable = provoliIsAvailable;
    }
}

