package com.twu.biblioteca.entity.user;

import com.twu.biblioteca.exception.InvalidLoginInfo;
import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class AdminTest{
    @Test
    public void shouldReturnUserWhenLoginSuccess() throws InvalidLoginInfo {
        String libraryNum = "330-1987";
        String password = "330";

        User user = Admin.handleLogin(libraryNum, password);

        assertThat(user, is(new Customer("330-1987", "330", null)));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionWhenLoginUnsuccess() throws InvalidLoginInfo {
        String libraryNum = "330-1987";
        String password = "1987";

        thrown.expect(InvalidLoginInfo.class);
        Admin.handleLogin(libraryNum, password);
    }
//    // solution1
//    @Test(expected = InvalidLoginInfo.class)
//    public void shouldThrowExceptionWhenLoginUnsuccess() throws InvalidLoginInfo {
//        String libraryNum = "330-1987";
//        String password = "1987";
//
//        Admin.handleLogin(libraryNum, password);
//    }
}