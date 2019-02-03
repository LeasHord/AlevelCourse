package com.Alevel.homeWorks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner stringScan = new Scanner(System.in);
        System.out.println("Insert string sequence");
        System.out.println("Insert string you want to replace");
        System.out.println("Insert string for replacement");
        System.out.print((SubString(stringScan.nextLine(), stringScan.nextLine(), stringScan.nextLine())));


    }

    public static String SubString (String someString, String wannaChange, String change){
        String [] newString = someString.split(".");
        String result = "";
        for(String str : newString){
            if(str.equalsIgnoreCase(wannaChange)){
               result+= replace(wannaChange, change);

            } result+=str;
            result+=" ";
        }
       return result;
    }

    public static String replace (String toChange, String change){
        return toChange.replace(toChange, change);
    }
}
