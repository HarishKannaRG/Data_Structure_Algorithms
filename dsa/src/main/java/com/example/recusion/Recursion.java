package com.example.recusion;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;

import com.example.helper.RecursionHelper;

public class Recursion {


    /**
     * @implNote This method is to remove a given character from a given string in recursive way
     * @param original
     * @param toRemove
     * @return
     */
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

    /**
     * @implNote This method is to generate all the possible subsets in an array that gives the target sum
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        RecursionHelper.combinationSumHelper(candidates, target, 0, result, new ArrayList<Integer>());
        return result;
    }

    public static ArrayList<String> subSequence(String processed, String unprocessed) {
        if(unprocessed.isBlank()) {
            ArrayList<String> result = new ArrayList<>();
            if(!processed.isBlank()) {
                result.add(processed);
            }
            return result;
        }
        char first = unprocessed.charAt(0);
        ArrayList<String> left = subSequence(processed+first, unprocessed.substring(1));
        ArrayList<String> right = subSequence(processed, unprocessed.substring(1));
        left.addAll(right);
        return left; 
    }
}
