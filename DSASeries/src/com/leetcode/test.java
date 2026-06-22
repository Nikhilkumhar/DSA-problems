package com.leetcode;


public class test {

    static int helperBS(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;
        int count = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                ans = mid;
                hi = mid - 1 ;

            }
            else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    static void main() {
        int[] arr = {2, 4, 6, 9, 9, 9};
        int target = 9;

        int index = helperBS(arr, target);
        System.out.println(index);
    }
}