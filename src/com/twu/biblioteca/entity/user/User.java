package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;

import java.util.ArrayList;
import java.util.Objects;

public abstract class User {
    private String libraryNumber;
    private String password;
    private ArrayList<Book> bookRented = new ArrayList<>();

    public User() {
    }

    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public User(String libraryNumber, String password, ArrayList<Book> bookRented) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.bookRented = bookRented;
    }

    public abstract void operate();

    public abstract String checkout(Book book);

    public abstract String returnBook(Book book);

    public abstract String checkout(Movie movie);

    public void quit() {
        System.out.println("See you next time. \nWish you have a good day.");
        System.exit(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(libraryNumber, user.libraryNumber) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryNumber, password);
    }
}
