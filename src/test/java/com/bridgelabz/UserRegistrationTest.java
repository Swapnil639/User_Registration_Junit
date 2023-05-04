package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration = new UserRegistration();

    @Test
    public void positiveFirstNameValidationTest()  {
        try {
            Assert.assertTrue(userRegistration.firstNameValidation("Swapnil"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativeFirstNameValidationTest() {
        try {
            userRegistration.firstNameValidation("swapnil6");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positiveLastNameValidationTest(){
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("Patil"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativeLastNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("patil@12"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void positiveEmailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("swapnilpatil6086@gmail.com"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativeEmailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("swap..123@gamil.com"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePhoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 9967891679"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 01245"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePassWordValidationTest(){
        try {
            Assert.assertTrue(userRegistration.passwordValidation("Swapnil@6087"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativePasswordValidationTest() {
        try {
            Assert.assertTrue(userRegistration.passwordValidation("swap@patil1@"));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}