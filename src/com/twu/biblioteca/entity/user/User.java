package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;

/**
 * have the basic function:list book,checkout book,return book
 */

public abstract class User {
    private String name;
    private String passward;

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
}
