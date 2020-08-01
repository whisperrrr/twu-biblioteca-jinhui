package com.twu.biblioteca.utils;

import com.twu.biblioteca.entity.Book;

import java.util.HashMap;
import java.util.Map;
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
        System.out.println("1.List of books 2.Check out books 3.Return books 4.List of Movie 5.Quit");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Map<String, String> getLoginInput() {
        Map<String, String> loginInput = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input your library number.");
        String libraryNum = scanner.nextLine();
        System.out.println("please input your password.");
        String password = scanner.nextLine();

        loginInput.put("libraryNum", libraryNum);
        loginInput.put("password", password);

        return loginInput;
    }
}
