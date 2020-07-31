package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Library;

public class Admin {
    private String name;
    private String password;
    private static Library libraryManaged = new Library();

    public static String showBookList() {
        return libraryManaged.getBooks().stream()
                .map(Book::toString)
                .reduce(String::concat)
                .orElse("");
    }

    public static String handleUserCheckout(Book bookHandled) {
        boolean handleFlag = false;
        for (Book book : libraryManaged.getBooks()) {
            if (book.getName().equals(bookHandled.getName()) && book.isInStock()) {
                book.setInStock(!book.isInStock());
                handleFlag = true;
            }
        }

        return handleFlag ? "Thank you!Enjoy the book. \n" : "Sorry,that book is not available. \n";
    }

    public static String handleUserReturn(Book bookHandled) {
        boolean handleFlag = false;
        for (Book book : libraryManaged.getBooks()) {
            if (book.getName().equals(bookHandled.getName()) && !book.isInStock()) {
                book.setInStock(!book.isInStock());
                handleFlag = true;
            }
        }
        return handleFlag ? "Thank you for returning the book. \n" : "This is not a valid book to return. \n";
    }
}
