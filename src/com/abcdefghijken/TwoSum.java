package com.abcdefghijken;
import java.util.HashMap;
import java.util.Map;

// 1 on Leetcode
public class TwoSum {

    public int[] testCase1Arr = {2,7,11,15};
    public int testCase1Target = 9;
    public int[] testCase2Arr = {3,2,4};
    public int testCase2Target = 6;
    public int[] testCase3Arr = {3,3};
    public int testCase3Target = 6;

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hs.containsKey(complement)) {
                return new int[]{hs.get(complement), i};
            }

            hs.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }


//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(i);
//            int complement = target - nums[i];
//            System.out.println("complement=" + complement);
//
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//
//            map.put(nums[i], i);
//        }
//
//        // If no solution is found, throw an exception
//        throw new IllegalArgumentException("No two sum solution");
//    }
}