package com.bridgelabz;


import java.util.regex.Pattern;

@FunctionalInterface
interface LambdaOperation {
    String validate(String regex, String input);
}

public class UserRegistration {
    public static void main(String[] args) {
        LambdaOperation firstName = (regex, input) -> {
            return "First Name Validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(firstName.validate("[A-Z][a-z]{2,}", "Swapnil"));

        LambdaOperation lastName = (regex, input) -> {
            return "Last name validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(lastName.validate("[A-Z][a-z]{2,}", "Patil"));

        LambdaOperation email = (regex, input) -> {
            return "Email validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(email.validate("(\\w+[.+-]?)*@\\w+(\\.+[a-zA-Z]{2,4})*", "swapnil123@gmail.com"));

        LambdaOperation phoneNumber = (regex, input) -> {
            return "Phone number validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(phoneNumber.validate("[+]91 [0-9]{10}", "+91 9967891679"));

        LambdaOperation password = (regex, input) -> {
            return "Password  validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(password.validate("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", "Swapnil#22"));

    }

    public boolean firstNameValidation(String firstName) throws InvalidInputException {
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new InvalidInputException("You enter Invalid First Name");
    }

    public boolean lastNameValidation(String lastName) throws InvalidInputException {
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new InvalidInputException("You enter Invalid Last Name ");
    }

    public boolean emailValidation(String email) throws InvalidInputException {
        if (Pattern.matches("(\\w+[.+-]?)*@\\w+(\\.+[a-zA-Z]{2,4})*", email))
            return true;
        else
            throw new InvalidInputException("You enter invalid mail");
    }

    public boolean phoneNumberValidation(String phoneNumber) throws InvalidInputException {
        if (Pattern.matches("[+]91 [0-9]{10}", phoneNumber))
            return true;
        else
            throw new InvalidInputException("You enter invalid Phone number");
    }

    public boolean passwordValidation(String password) throws InvalidInputException {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new InvalidInputException("You Enter invalid Password");
    }
}