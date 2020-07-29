package com.twu.biblioteca.entity;

import com.twu.biblioteca.entity.user.Customer;
import com.twu.biblioteca.entity.user.User;

import java.util.ArrayList;

public class Library {
    private String name = "Biblioteca";
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void run() {
        welcome();

        User user = login();
        user.operate(books);
    }

    public User login() {
        return new Customer();
    }

    public void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great boot titles in Bangalore!");
    }


}
