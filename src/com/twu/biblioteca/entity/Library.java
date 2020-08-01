package com.twu.biblioteca.entity;

import com.twu.biblioteca.DataProvider;
import com.twu.biblioteca.entity.user.Admin;
import com.twu.biblioteca.entity.user.Customer;
import com.twu.biblioteca.entity.user.User;
import com.twu.biblioteca.exception.InvalidLoginInfo;
import com.twu.biblioteca.utils.InputUtil;

import java.util.ArrayList;
import java.util.Map;


public class Library {
    private String name = "Biblioteca";
    private ArrayList<Book> books = DataProvider.provideBookData();
    private ArrayList<Movie> movies = DataProvider.provideMovieData();
    private ArrayList<Customer> users = DataProvider.provideCustomerData();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Customer> getUsers() {
        return users;
    }

    public void run() {
        welcome();

        User user = login();
        user.operate();
    }

    public User login() {
        while (true) {
            Map<String, String> loginInput = InputUtil.getLoginInput();
            try {
                return Admin.handleLogin(loginInput.get("libraryNum"), loginInput.get("password"));
            } catch (InvalidLoginInfo invalidLoginInfo) {
                System.out.println("Wrong password,please try again.");
            }
        }
    }

    public void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great boot titles in Bangalore!");
    }

}
