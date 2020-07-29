package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;

/**
 * have the basic function:list book,checkout book,return book
 */

public abstract class User {
    private String name;
    private String password;

    public abstract void operate();

    public ArrayList<Book> list() {
        return null;
    }

    public String checkout() {
        return null;
    }

    public String returnBook() {
        return null;
    }

    public void quit() {
        System.out.println("See you next time. \nWish you have a good day.");
        System.exit(0);
    }
}
