package com.twu.biblioteca.entity;


public class Book {
    private String name;
    private String author;
    private int publishYear;
    private boolean isInStock;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author, int publishYear, boolean isInStock) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n' +
                "author = " + author + '\n' +
                "publishYear = " + publishYear + '\n' +
                "isInStock = " + isInStock + "\n\n";
    }
}
