package com.twu.biblioteca.entity;

public class Movie {
    private String name;
    private String director;
    private int releaseDate;
    private int rating;
    private boolean isInStock;

    public Movie(String name, String director, int releaseDate, int rating, boolean isInStock) {
        this.name = name;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.isInStock = isInStock;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n' +
                "director = " + director + '\n' +
                "releaseDate = " + releaseDate + '\n' +
                "rating = " + rating + '\n' +
                "isInStock = " + isInStock + "\n\n";
    }
}
