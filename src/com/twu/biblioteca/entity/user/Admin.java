package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Library;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.exception.InvalidLoginInfo;

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

    public static String showMovieList() {
        return libraryManaged.getMovies().stream()
                .map(Movie::toString)
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

    public static String handleUserCheckout(Movie movieHandled) {
        boolean handleFlag = false;
        for (Movie movie : libraryManaged.getMovies()) {
            if (movie.getName().equals(movieHandled.getName()) && movie.isInStock()) {
                movie.setInStock(!movie.isInStock());
                handleFlag = true;
            }
        }
        return handleFlag ? "Thank you!Enjoy the movie. \n" : "Sorry,that movie is not available. \n";
    }

    public static User handleLogin(String libraryNum, String password) throws InvalidLoginInfo {
        Customer userInput = new Customer(libraryNum, password);

        return libraryManaged.getUsers().stream()
                .filter(ele -> ele.equals(userInput))
                .findFirst()
                .orElseThrow(InvalidLoginInfo::new);
    }
}
