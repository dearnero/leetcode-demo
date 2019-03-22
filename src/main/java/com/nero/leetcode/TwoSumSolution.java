package com.nero.leetcode;

/**
 * <p>
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * date : 2019-03-22
 * time : 15:21
 * </p>
 *
 * @author Nero
 */
public class TwoSumSolution {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSumSolution().twoSum(nums, target);
        if (result != null) {
            System.out.println(result[0] + "," + result[1]);
        }

    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int f = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int t = nums[j];
                if (f + t == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
