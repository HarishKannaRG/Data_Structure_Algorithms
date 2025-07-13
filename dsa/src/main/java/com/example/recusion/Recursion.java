package com.example.recusion;

import java.util.ArrayList;
import java.util.List;

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
}
