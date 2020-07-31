package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    private Customer customer;
    private ArrayList<Book> booksData;
    private Book bookNotInStock;
    private Book bookInStock;

    @Before
    public void setUp() {
        customer = new Customer();
        booksData = new ArrayList<>(
                Arrays.asList(
                        new Book("非暴力沟通", "[美]马歇尔卢森堡", 2016, false),
                        new Book("图解HTTP", "[日]上野宣", 2014, true)
                )
        );
        bookInStock = new Book("24个比利");
        bookNotInStock = new Book("非暴力沟通");
    }

//    @Test
//    public void shouldListAllBookDetail() {
//        // 把输出定向到ByteArrayOutputtStream中
//        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//
//        // 执行要测试的程序
//        customer.list(booksData);
//
//        // 对控制台的输出进行匹配断言
//        assertThat(outContent.toString().replaceAll("[\r\n]", ""), is(booksDataString));
//    }
    @Test
    public void shouldGetSuccessInfoWhenCheckoutSuccess() {
        String checkoutResult = customer.checkout(bookInStock);
        assertThat(checkoutResult,is("Thank you!Enjoy the book. \n"));
    }

    @Test
    public void shouldGetFailureInfoWhenCheckoutUnsuccess() {
        String checkoutResult = customer.checkout(bookNotInStock);
        assertThat(checkoutResult,is("Sorry,that book is not available. \n"));
    }

    @Test
    public void shouldGetSuccessInfoWhenReturnSuccess() {
        String returnResult = customer.returnBook(bookNotInStock);
        assertThat(returnResult,is("Thank you for returning the book. \n"));
    }

    @Test
    public void shouldGetFailureInfoWhenReturnUnsuccess() {
        String returnResult = customer.returnBook(bookInStock);
        assertThat(returnResult,is("This is not a valid book to return. \n"));
    }

}