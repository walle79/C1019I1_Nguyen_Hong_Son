package com.codegym.model;

public class Customer {
    private int id;
    private String address;
    private String email;
    private String name;

    public Customer(int id, String address, String email, String name) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.name = name;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
