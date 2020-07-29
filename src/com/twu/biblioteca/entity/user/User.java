package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * have the basic function:list book,checkout book,return book
 */

public abstract class User {
    private String name;
    private String password;

    public abstract void operate(ArrayList<Book> books);

    public void list(ArrayList<Book> books) {
        books.forEach(System.out::println);
    }

    public void checkout(ArrayList<Book> books) {
        boolean updateFlag = false;
        System.out.println("Please input the name of book.");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        for (Book book : books) {
            if (book.getName().equals(bookName) && book.isInStock()) {
                book.setInStock(false);
                updateFlag = true;
                updateDatabase();
            }
        }

        printCheckoutResult(updateFlag);
        list(books);
    }

    public String returnBook() {
        return null;
    }

    public void quit() {
        System.out.println("See you next time. \nWish you have a good day.");
        System.exit(0);
    }

    private void printCheckoutResult(boolean updateFlag) {
        if (updateFlag) {
            System.out.println("Thank you!Enjoy the book. \n");
        } else {
            System.out.println("Sorry,that book is not available \n");
        }
    }

    // for further database TODO
    private void updateDatabase() {
    }
}
