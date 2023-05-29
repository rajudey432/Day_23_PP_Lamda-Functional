package com.bridgelabz;

import static com.bridgelabz.UserValidator.validate;

public class Main {
    public static void main(String[] args) {
        String firstName = "Raju";
        String lastName = "Dey";
        String email = "rajudey432@gmail.com";
        String mobile = "8250398319";
        String password = "password123";

        boolean isValid = validate(firstName, lastName, email, mobile, password);

        if (isValid) {
            System.out.println("User input is valid");
        } else {
            System.out.println("User input is invalid");
        }
    }

}