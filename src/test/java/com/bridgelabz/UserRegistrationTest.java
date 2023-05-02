package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTest() {
        boolean actual1 = userRegistration.firstName("Swapnil");
        boolean actual2 = userRegistration.firstName("swapnil");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateLastNameTest() {
        boolean actual1 = userRegistration.lastName("Patil");
        boolean actual2 = userRegistration.lastName("patil");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateEmailTest() {
        boolean actual1 = userRegistration.emailID("abc100@yahoo.com");
        boolean actual2 = userRegistration.emailID(".Swapnil@gmail.com");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateMobile() {
        boolean actual1 = userRegistration.phoneNumber("+91-7350310455");
        boolean actual2 = userRegistration.phoneNumber("2395824158");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePassword() {
        boolean actual1 = userRegistration.password("Swapnil@1233");
        boolean actual2 = userRegistration.password("swapnil");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);

    }
}
