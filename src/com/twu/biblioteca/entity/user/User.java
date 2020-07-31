package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import java.util.ArrayList;

public abstract class User {
    private String name;
    private String password;
    private ArrayList<Book> bookRented = new ArrayList<>();

    public abstract void operate();

    public abstract String checkout(Book book);

    public abstract String returnBook(Book book);

    public void quit() {
        System.out.println("See you next time. \nWish you have a good day.");
        System.exit(0);
    }

}
