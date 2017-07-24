package com.test.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vincent on 2017/7/24.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] res = ts.twoSumMap(new int[]{7, 7, 2, 15}, 9);
        System.out.println("args = [" + res[0] + "]");
        System.out.println("args = [" + res[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i != j && remain == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSumMap(int[] nums, int target) {

        Map<Integer, Integer> init = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            init.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int j = init.get(target - nums[i]);
            if (init.get(target - nums[i]) != null && j != i) {
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }


}
