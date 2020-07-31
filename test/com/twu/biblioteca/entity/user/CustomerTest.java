package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    private Customer customer;
    private Book bookNotInStock;
    private Book bookInStock;
    private Movie movieInStock;
    private Movie movieNotInStock;

    @Before
    public void setUp() {
        customer = new Customer();
        bookInStock = new Book("24个比利");
        bookNotInStock = new Book("非暴力沟通");
        movieInStock = new Movie("The Avengers");
        movieNotInStock = new Movie("七号房的礼物");
    }

    @Test
    public void shouldGetSuccessInfoWhenCheckoutSuccess() {
        String checkoutResult = customer.checkout(bookInStock);
        assertThat(checkoutResult, is("Thank you!Enjoy the book. \n"));
    }

    @Test
    public void shouldGetFailureInfoWhenCheckoutUnsuccess() {
        String checkoutResult = customer.checkout(bookNotInStock);
        assertThat(checkoutResult, is("Sorry,that book is not available. \n"));
    }

    @Test
    public void shouldGetSuccessInfoWhenReturnSuccess() {
        String returnResult = customer.returnBook(bookNotInStock);
        assertThat(returnResult, is("Thank you for returning the book. \n"));
    }

    @Test
    public void shouldGetFailureInfoWhenReturnUnsuccess() {
        String returnResult = customer.returnBook(bookInStock);
        assertThat(returnResult, is("This is not a valid book to return. \n"));
    }

    @Test
    public void shouldGetSuccessInfoWhenCheckoutMovieSuccess() {
        String checkoutResult = customer.checkout(movieInStock);
        assertThat(checkoutResult,is("Thank you!Enjoy the movie. \n"));
    }

    @Test
    public void shouldGetFailureInfoWhenCheckoutMovieUnsuccess() {
        String checkoutResult = customer.checkout(movieNotInStock);
        assertThat(checkoutResult,is("Sorry,that movie is not available. \n"));
    }

}