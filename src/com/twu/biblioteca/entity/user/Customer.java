package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    public Customer() {
        super();
    }

    @Override
    public void operate(ArrayList<Book> books) {
        while (true) {
            System.out.println("please have a choice");
            System.out.println("1.List of books 2.Check out books 3.Return books 4.Quit");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> list(books);
                case 2 -> checkout(books);
                case 3 -> {
                    String returnResult = returnBook();
                    System.out.println(returnResult);
                }
                case 4 -> quit();
                default -> System.out.println("You input a invalid option,please try again.");
            }
        }
    }
}
