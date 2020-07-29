package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.exception.InvalidOptionException;

import java.util.ArrayList;

/**
 * have the basic function:list book,checkout book,return book
 */

public abstract class User {
    private String name;
    private String password;

    public abstract void operate(ArrayList<Book> books);

    public void list(ArrayList<Book> books) {
        books.forEach(book -> System.out.println(book));
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
