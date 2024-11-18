package com.bakaitest.smtptest.utils;

import java.util.Random;

//кажется это метод перестановки
public class StringUtils {
    public static String shuffle(String input) {
        char[] characters = input.toCharArray(); // создается массив символов, инпут в виде стринга переводим в символы
        Random random = new Random();

        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = characters[index];
            characters[index] = characters[i];
            characters[i] = temp;
        }
        return new String(characters);
    }
}