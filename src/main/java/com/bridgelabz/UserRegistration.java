package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName) {
        return Pattern.matches("[A-Z]{1}[a-zA-z]{2,}", firstName);

    }

    public boolean lastName(String lastName) {
        return Pattern.matches("[A-Z]{1}[a-zA-z]{2,}", lastName);

    }

    public boolean emailID(String emailID) {
        return Pattern.matches("^[a-zA-Z\\d]{1,1}[a-zA-Z\\d+_.-]+@[a-zA-Z]+.[a-zA-z.]{2,}", emailID);
    }

    public boolean phoneNumber(String phoneNumber) {
        return Pattern.matches("^[+0-9]{2,}+-[0-9]{10}$", phoneNumber);
    }

    public boolean password(String password) {
        return Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]){8,}", password);

    }
}
