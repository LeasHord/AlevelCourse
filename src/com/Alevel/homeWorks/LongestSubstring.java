package com.Alevel.homeWorks;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.print(substring("I wanna be a cinderella; But I'm too lazy for that; Guess, I'm rather a Sleeping Beauty") + " substring is longest");

    }
    public static int substring(String string){
String substrings [] = string.split(";");
        int maxLength = substrings[0].length();
        int maxIndex = 0;
for(int i = 0; i < substrings.length; i++){
    if(maxLength < substrings[i].length()){
        maxLength = substrings[i].length();
        maxIndex = i;
    }
}
        return maxIndex;
    }
}
