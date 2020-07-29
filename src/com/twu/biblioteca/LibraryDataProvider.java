package com.twu.biblioteca;


import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * provide library data when for test
 */

public class LibraryDataProvider {
    public static ArrayList<Book> provideBookData() {
        return new ArrayList<>(
                Arrays.asList(
                        new Book("非暴力沟通", "[美]马歇尔卢森堡", 2016,false),
                        new Book("图解HTTP", "[日]上野宣", 2014,true),
                        new Book("24个比利", "[美]丹尼尔凯斯", 2015,true)));
    }
}