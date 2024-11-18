package com.bakaitest.smtptest.utils.random;

import java.security.SecureRandom;

public class RandomStringGenerator {
    private static final String UPPER_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETTERS = UPPER_LETTERS + LOWER_LETTERS;
    private static final String NUMBERS = "0123456789";
    private static final String LETTERS_AND_NUMBERS = LETTERS + NUMBERS;
    private static final SecureRandom random = new SecureRandom();

    public static String randomNumbers(int length) {
        return generateRandomString(length, NUMBERS);
    }

    public static String randomUpperLetters(int length) {
        return generateRandomString(length, UPPER_LETTERS);
    }

    public static String randomLowerLetters(int length) {
        return generateRandomString(length, LOWER_LETTERS);
    }

    public static String randomLettersAndNumbers(int length) {
        return generateRandomString(length, LETTERS_AND_NUMBERS);
    }

    private static String generateRandomString(int length, String characters) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}