package com.example.helper;

import java.util.ArrayList;
import java.util.List;

public class RecursionHelper {

    public static void combinationSumHelper(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> temp) {
        if(index >= candidates.length) {
            if(target == 0) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[index] <= target) {
            temp.add(candidates[index]);
            combinationSumHelper(candidates, target-candidates[index], index+1, result, temp);
            temp.remove(temp.size()-1);
        }
        combinationSumHelper(candidates, target, index+1, result, temp);
    }
}
