package com.twu.biblioteca.entity;

public class Movie {
    private String name;
    private String director;
    private int releaseDate;
    private boolean isInStock;

    public Movie(String name, String director, int releaseDate, boolean isInStock) {
        this.name = name;
        this.director = director;
        this.releaseDate = releaseDate;
        this.isInStock = isInStock;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n' +
                "director = " + director + '\n' +
                "releaseDate = " + releaseDate + '\n' +
                "isInStock = " + isInStock + "\n\n";
    }
}
