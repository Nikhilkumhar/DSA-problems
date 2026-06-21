package com.leetcode;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minlength = Integer.MAX_VALUE;

        for (String s : strs) {
            minlength = Math.min(minlength, s.length());
        }

        int i = 0;

        while (i < minlength) {
            for (String s : strs) {
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        System.out.println("complete");
        return strs[0].substring(0, i);

    }

    public static void main(String[] args) {

        String[] strs = {"flow", "flow", "flow"};

        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }
}