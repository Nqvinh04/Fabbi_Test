package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String longestCommonPrefix(String[] input){
        if (input.length == 0)
            return "";
        String prefix = input[0];
        for (int i = 1; i < input.length; i++)
            while (input [i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        int n = nums.length;

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            String bitmask = Integer.toBinaryString(i).substring(1);

            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{ "dog","racecar","car"}));
        System.out.println(subsets(new int[] {1,2,3}));
    }
}
