package com.mainpackage;

public class Admins extends Users {
    // Attributes
    private boolean isAdmin;

    // Constructor
    public Admins(String name, String username, String password, boolean isAdmin) {
        super(name, username, password);
        this.isAdmin = isAdmin;
    }

    // Getters and Setters
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    // Methods
    public void createUser() {
        // create a new user
    }

    public void updateUser() {
        // update an existing user
    }

    public void deleteUser() {
        // delete an existing user
    }

    public void searchUser() {
        // search for a specific user
    }

    public void viewAllUsers() {
        // view all users in the system
    }

    public void registerAdmin() {
        // register a new admin user
    }
}
