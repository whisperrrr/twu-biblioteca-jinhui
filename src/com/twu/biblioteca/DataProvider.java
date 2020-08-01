package com.twu.biblioteca;


import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.entity.user.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * provide library data when for test
 */

public class DataProvider {
    public static ArrayList<Book> provideBookData() {
        return new ArrayList<>(
                Arrays.asList(
                        new Book("非暴力沟通", "[美]马歇尔·卢森堡", 2016, false),
                        new Book("图解HTTP", "[日]上野宣", 2014, true),
                        new Book("24个比利", "[美]丹尼尔·凯斯", 2015, true)
                )
        );
    }

    public static ArrayList<Movie> provideMovieData() {
        return new ArrayList<>(
                Arrays.asList(
                        new Movie("七号房的礼物", "李焕英", 2013, 9, false),
                        new Movie("The Avengers", "乔斯·韦灯", 2012, 9, true),
                        new Movie("Interstellar", "克里斯托弗·诺兰", 2014, 8, true)
                )
        );
    }

    public static ArrayList<Customer> provideCustomerData() {
        ArrayList<Book> bookRentedList = new ArrayList<>();
        bookRentedList.add(new Book("非暴力沟通", "[美]马歇尔·卢森堡", 2016, false));

        return new ArrayList<>(
                Arrays.asList(
                        new Customer("330-1987","330",null),
                        new Customer("731-1994","731",bookRentedList)
                )
        );
    }
}