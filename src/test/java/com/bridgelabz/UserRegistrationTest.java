package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTestForPositive() {
        boolean actual1 = userRegistration.firstName("Swapnil");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateFirstNameTestForNegative() {
        boolean actual2 = userRegistration.firstName("swapnil6");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateLastNameTestForPositive() {
        boolean actual1 = userRegistration.lastName("Patil");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateLastNameTestForNegative() {
        boolean actual2 = userRegistration.lastName("patil6.");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateEmailTestPositive() {
        boolean actual1 = userRegistration.emailID("abc-100@yahoo.com");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateEmailTestNegative() {
        boolean actual2 = userRegistration.emailID(".swapnil@gmail.com");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateMobilePositive() {
        boolean actual1 = userRegistration.phoneNumber("+91-9967891679");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateMobileNegative() {
        boolean actual2 = userRegistration.phoneNumber("8797654");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePassword() {
        boolean actual2 = userRegistration.password("Swapnil@123");
        Assert.assertTrue(actual2);
    }

    @Test
    public void validatePasswordNegative() {
        boolean actual1 = userRegistration.password("1swapnil");
        Assert.assertFalse(actual1);
    }

}
