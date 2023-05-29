package com.bridgelabz;

import java.util.function.Function;

public class UserValidator {

    private static final Function<String, Boolean> isNotEmpty = s -> !s.isEmpty();
    private static final Function<String, Boolean> isLessThan255Characters = s -> s.length() <= 255;
    private static final Function<String, Boolean> isValidEmailAddress = s -> {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return s.matches(regex);
    };
    private static final Function<String, Boolean> isValidMobileNumber = s -> {
        String regex = "^[0-9]{10}$";
        return s.matches(regex);
    };
    private static final Function<String, Boolean> isAtLeast8CharactersLong = s -> s.length() >= 8;

    public static boolean validate(String firstName, String lastName, String email, String mobile, String password) {
        return isNotEmpty.apply(firstName) &&
                isLessThan255Characters.apply(firstName) &&
                isNotEmpty.apply(lastName) &&
                isLessThan255Characters.apply(lastName) &&
                isValidEmailAddress.apply(email) &&
                isValidMobileNumber.apply(mobile) &&
                isAtLeast8CharactersLong.apply(password);
    }

}
