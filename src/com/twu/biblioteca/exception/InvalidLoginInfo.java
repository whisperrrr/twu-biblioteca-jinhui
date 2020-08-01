package com.twu.biblioteca.exception;

public class InvalidLoginInfo extends Exception{
    public InvalidLoginInfo() {
    }

    public InvalidLoginInfo(String message) {
        super(message);
    }
}
