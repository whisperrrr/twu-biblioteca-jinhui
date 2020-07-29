package com.twu.biblioteca.entity;

import com.twu.biblioteca.entity.user.Customer;

public class Library {
    private String name = "Biblioteca";

    public void run() {
        welcome();
        login();
    }

    private void login() {
        // Assuming that login successfull
        Customer customer = new Customer();

    }

    private void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great boot titles in Bangalore!");
    }


}
