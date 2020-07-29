package com.twu.biblioteca.entity;


public class Book {
    private String name;
    private String author;
    private int publishYear;

    public Book() {
    }

    public Book(String name, String author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return  "name= " + name + '\n' +
                "author= " + author + '\n' +
                "publishYear=" + publishYear + '\n';
    }
}
