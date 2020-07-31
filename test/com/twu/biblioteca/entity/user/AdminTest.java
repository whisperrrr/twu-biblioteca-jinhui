package com.twu.biblioteca.entity.user;

import junit.framework.TestCase;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AdminTest extends TestCase {
    public void shouldReturnUserWhenLoginSuccess() {
        String libraryNum = "330-1987";
        String password = "330";

        User user = Admin.handleLogin(libraryNum, password);

        assertThat(user, is(new Customer("330-1987", "330", null)));
    }

    public void shouldReturnNullWhenLoginUnsuccess() {
        String libraryNum = "330-1987";
        String password = "1987";

        User user = Admin.handleLogin(libraryNum, password);

        assertNull(user);
    }
}