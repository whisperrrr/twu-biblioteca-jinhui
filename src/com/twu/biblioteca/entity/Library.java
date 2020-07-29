package com.twu.biblioteca.entity;

import com.twu.biblioteca.entity.user.Customer;
import com.twu.biblioteca.entity.user.User;

public class Library {
    private String name = "Biblioteca";

    public void run() {
        welcome();

        User user = login();
        user.operate();
    }

    public User login() {
        return new Customer();
    }

    public void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great boot titles in Bangalore!");
    }


}
