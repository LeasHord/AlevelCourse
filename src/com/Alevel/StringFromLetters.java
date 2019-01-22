package com.Alevel;

public class StringFromLetters {
    public static void main(String[] args) {
        System.out.println(letters("m a m a s i t a o u r h o m e"));
    }

    public static String letters(String letters) {
        String[] newLetters = letters.split(" ");
        String finalString = "";

        for(int i = 0; i < newLetters.length; ++i) {
            for(int j = 0; j < i; ++j) {
                while(j < 3) {
                    finalString = newLetters[(int)(Math.random() * (double)newLetters.length)];
                    ++j;
                }
            }

            finalString = finalString;
        }

        return finalString;
    }
}

