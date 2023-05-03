package com.bridgelabz;

import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTestForPositive() {
        boolean actual1 = false;
        try {
            actual1 = userRegistration.firstNameValidation("Swapnil");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateFirstNameTestForNegative() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.firstNameValidation("swapnil6");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateLastNameTestForPositive() {
        boolean actual1 = false;
        try {
            actual1 = userRegistration.lastNameValidation("Patil");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateLastNameTestForNegative() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.lastNameValidation("patil6");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateEmailTestPositive() {
        boolean actual1 = false;
        try {
            actual1 = userRegistration.emailValidation("abc-100@yahoo.com");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateEmailTestNegative() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.emailValidation(".swapnil@gmail.com");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateMobilePositive() {
        boolean actual1 = false;
        try {
            actual1 = userRegistration.phoneNumberValidation("+91-9967891679");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateMobileNegative() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.phoneNumberValidation("8797654");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validatePassword() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.passwordValidation("Swapnil@123");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validatePasswordNegative() {
        boolean actual1 = false;
        try {
            actual1 = userRegistration.passwordValidation("1swapnil");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

}
