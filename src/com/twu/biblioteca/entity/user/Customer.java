package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;

import static com.twu.biblioteca.entity.user.Admin.showBookList;
import static com.twu.biblioteca.entity.user.Admin.showMovieList;
import static com.twu.biblioteca.utils.InputUtil.getBookInput;
import static com.twu.biblioteca.utils.InputUtil.getUserChoice;

public class Customer extends User {
    public Customer() {
        super();
    }

    @Override
    public void operate() {
        while (true) {
            int userChoice = getUserChoice();

            switch (userChoice) {
                case 1 -> {
                    String bookList = showBookList();
                    System.out.println(bookList);
                }
                case 2 -> {
                    Book book = getBookInput();
                    String checkoutResult = checkout(book);
                    System.out.println(checkoutResult);
                }
                case 3 -> {
                    Book book = getBookInput();
                    String returnResult = returnBook(book);
                    System.out.println(returnResult);
                }
                case 4 -> {
                    String movieList = showMovieList();
                    System.out.println(movieList);
                }
                case 5 -> quit();
                default -> System.out.println("You input a invalid option,please try again.");
            }
        }
    }

    @Override
    public String checkout(Book book) {
        return Admin.handleUserCheckout(book);
    }

    @Override
    public String returnBook(Book book) {
        return Admin.handleUserReturn(book);
    }

    @Override
    public String checkout(Movie movie) {
        return Admin.handleUserCheckout(movie);
    }
}
