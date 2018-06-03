package com.example.yuchen.password_validator;

public class Validator {

    public static int stage1(String pw) {
        // Count the number of passed rules
        int count = 0;

        // Check if the password is empty
        if (pw.isEmpty()) {
            return 0;
        }

        // Rule 1 - it is not “password” (case insensitive)
        // Check if the password is the string "password"
        if (!pw.equalsIgnoreCase("password")) {
            count++;
        }

        // Rule 2 - it is at least 8 characters long
        // Check if the length of the password is greater than 8
        if (pw.length() >= 8) {
            count++;
        }

        return count;
    }
}