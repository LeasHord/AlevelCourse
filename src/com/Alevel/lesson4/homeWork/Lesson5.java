package com.Alevel.lesson4.homeWork.homeWork1;

import java.sql.SQLOutput;
import java.util.Arrays;


public class Lesson5 {
    public static void main(String[] args) {
        System.out.println(IsPalindrome("Euston saw I was not Sue"));
        System.out.println(NumberOfWords("some words are here to be methodically counted"));
        System.out.print(CheckRegister("Some leTTers Here aRE HUGe"));
        System.out.println();
        System.out.println(deleteSameSymbols("abs dra aft"));


    }

    public static boolean IsPalindrome(String str) {
        String string = str.replace(" ", "");
        boolean result = true;
        String words = string.toLowerCase();
        for (int i = 0; i < words.length() / 2; i++) {
            if (words.charAt(i) != words.charAt(string.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int NumberOfWords(String str) {
        String string[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            count++;
        }

        return count;
    }

    public static String CheckRegister(String someStr) {
        int smallCount = 0;
        int bigCount = 0;
        String result = "";
        String words[] = someStr.split(" ");
        for (String word : words) {
            smallCount += smallLetters(word);
            bigCount += bigLetters(word);
            result = (smallCount) + " small letters" + (bigCount) + " big letters";
        }
        return result;
    }

    public static int smallLetters(String word) {
        char someWord[] = new char[word.length()];
        int smallCount = 0;
        for (int i = 0; i < someWord.length; i++) {
            someWord[i] = word.charAt(i);
            if (Character.isLowerCase(someWord[i])) {
                smallCount++;
            }
        }
        return smallCount;
    }

    public static int bigLetters(String word) {
        char someWord[] = new char[word.length()];
        int bigCount = 0;
        for (int j = 0; j < someWord.length; j++) {
            someWord[j] = word.charAt(j);
            if (Character.isUpperCase(someWord[j])) {
                bigCount++;
            }
        }
        return bigCount;
    }

    public static String deleteSameSymbols(String string) {
        String res = "";
        String stringWithoutWhitespaces = remove(string, " ");
        while (stringWithoutWhitespaces.length()!=0) {
            res += stringWithoutWhitespaces.substring(0, 1);
            stringWithoutWhitespaces = remove(stringWithoutWhitespaces, stringWithoutWhitespaces.substring(0,1));

        }

        return res;
    }
    public static String remove(String str, String word) {
        return str.replace(word, "");

    }
}
