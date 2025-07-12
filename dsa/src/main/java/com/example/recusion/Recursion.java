package com.example.recusion;

public class Recursion {

    public static String removeChar(String original, char toRemove) {
        System.out.println("original:"+original);
        if(original.isBlank()) {
            return "";
        }
        char charAtZero = original.charAt(0);
        if(charAtZero == toRemove) {
            System.out.println("not equal");
            return removeChar(original.substring(1), toRemove);
        }
        else {
            return charAtZero+removeChar(original.substring(1), toRemove);
        }
    }
}
