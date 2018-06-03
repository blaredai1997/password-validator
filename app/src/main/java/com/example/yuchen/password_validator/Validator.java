package com.example.yuchen.password_validator;

import java.util.regex.Pattern;

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

    public static int stage2(String pw) {
        // Count the number of passed rules
        int count = 0;

        // Check if the two rules of stage 1 are passed
        count += stage1(pw);

        // Rule 3 - requiring at least 1 special character
        // Check if the password has at least 1 special character
        if (Pattern.compile(".*[\\\\\\\\!\\\"#$%&()*+,./:;<=>?@\\\\[\\\\]^_{|}~].*").matcher(pw).find()) {
            count++;
        }

        // Rule 4 - requiring at least 1 digit
        // Check if the password has at least 1 digit
        if (Pattern.compile(".*\\d.*").matcher(pw).find()) {
            count++;
        }

        // Rule 5 - requiring both upper and lower case
        // Check if the password has both upper and lower case
        if (Pattern.compile(".*[a-z].*").matcher(pw).find() &&
                Pattern.compile(".*[A-Z].*").matcher(pw).find()) {
            count++;
        }

        return count;
    }
}