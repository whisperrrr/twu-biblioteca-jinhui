package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    private Customer customer;
    private Book bookNotInStock;
    private Book bookInStock;

    @Before
    public void setUp() {
        customer = new Customer();
        bookInStock = new Book("24个比利");
        bookNotInStock = new Book("非暴力沟通");
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

}