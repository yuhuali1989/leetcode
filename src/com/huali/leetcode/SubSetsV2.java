package com.huali.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuhuali on 16/6/11.
 */
//Given a collection of integers that might contain duplicates, nums, return all possible subsets.
//
//        Note: The solution set must not contain duplicate subsets.
//
//        For example,
//        If nums = [1,2,2], a solution is:
//
//        [
//        [2],
//        [1],
//        [1,2,2],
//        [2,2],
//        [1,2],
//        []
//        ]
public class SubSetsV2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]){}

        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        new SubSetsV2().subsetsWithDup(nums);

    }
}
