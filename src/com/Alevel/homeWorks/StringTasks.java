package com.Alevel.homeWorks;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringTasks {
    public static void main(String[] args) {
        System.out.println(IsPalindrome("Euston saw I was not Sue"));
        System.out.println(NumberOfWords("some words are here to be methodically counted"));
        System.out.print(CheckRegister("Some leTTers Here aRE HUGe"));
        System.out.println();
        System.out.println(deleteSameSymbols("abs dra aft"));
        System.out.println(identifier("_mohфйwe324"));
        System.out.print(Arrays.toString(numbers("some 21 sym0ls h3r3 ar3 12")));
        System.out.println();
        System.out.println(longestWord("mama ad sum thief banana lone"));
    }

    public static boolean IsPalindrome(String str) {
        String string = str.replace(" ", "");
        boolean result = true;
        String words = string.toLowerCase();

        for (int i = 0; i < words.length() / 2; ++i) {
            if (words.charAt(i) != words.charAt(string.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static int NumberOfWords(String str) {
        String[] string = str.split(" ");
        int count = 0;

        for (int i = 0; i < string.length; ++i) {
            ++count;
        }

        return count;
    }

    public static String CheckRegister(String someStr) {
        int smallCount = 0;
        int bigCount = 0;
        String result = "";
        String[] words = someStr.split(" ");
        for (String str : words) {
            smallCount += smallLetters(str);
            bigCount += bigLetters(str);
        }
        result = (smallCount) + ", " + (bigCount);

        return result;
    }

    public static int smallLetters(String word) {
        char[] someWord = new char[word.length()];
        int smallCount = 0;

        for (int i = 0; i < someWord.length; ++i) {
            someWord[i] = word.charAt(i);
            if (Character.isLowerCase(someWord[i])) {
                ++smallCount;
            }
        }
        return smallCount;
    }

    public static int bigLetters(String word) {
        char[] someWord = new char[word.length()];
        int bigCount = 0;

        for (int j = 0; j < someWord.length; ++j) {
            someWord[j] = word.charAt(j);
            if (Character.isUpperCase(someWord[j])) {
                ++bigCount;
            }
        }

        return bigCount;
    }

    public static String deleteSameSymbols(String string) {

        String res = "";

        for (String stringWithoutWhitespaces = remove(string, " "); stringWithoutWhitespaces.length() > 0;
             stringWithoutWhitespaces = remove(stringWithoutWhitespaces, stringWithoutWhitespaces.substring(0, 1))) {
            res += stringWithoutWhitespaces.substring(0, 1);
        }
        return res;
    }

    public static String remove(String str, String word) {
        return str.replace(word, "");
    }

    public static boolean identifier(String string) {
        boolean isIdentifier = true;
        for (int i = 0; i < string.length(); i++) {


        }
        return isIdentifier;
    }

    public static int[] numbers(String somestr) {
        int[] numbers = new int[somestr.length()];
        char newCh[] = somestr.toCharArray();
        for(int i = 0; i < newCh.length; i++){


        }
        return numbers;
    }

    public static String longestWord(String words) {
        String newWords[] = words.split(" ");
        String result;
        result = newWords[0];
        for (int i = 0; i < newWords.length; i++) {

            if (result.length() < newWords[i].length()) {
                result = newWords[i];
            }
        }
        return result;
    }
}






