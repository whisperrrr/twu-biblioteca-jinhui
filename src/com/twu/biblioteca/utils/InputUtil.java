package com.twu.biblioteca.utils;

import com.twu.biblioteca.entity.Book;

import java.util.Scanner;

public class InputUtil {
    public static Book getBookInput() {
        System.out.println("Please input the name of book.");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        return new Book(bookName);
    }

    public static int getUserChoice() {
        System.out.println("please have a choice");
        System.out.println("1.List of books 2.Check out books 3.Return books 4.Quit");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

}
