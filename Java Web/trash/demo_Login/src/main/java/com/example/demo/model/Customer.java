package com.example.demo.model;

public class Customer {
    private String username;
    private String password;
    private String mail;
    private String hello;

    public Customer() {
    }

    public Customer(String username, String password, String mail, String hello) {
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.hello = hello;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
