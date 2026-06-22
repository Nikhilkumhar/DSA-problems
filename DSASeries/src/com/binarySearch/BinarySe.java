package com.binarySearch;

public class BinarySe {

    static int helperBS(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }

    static void main() {
        int[] arr = {3, 4, 6, 8, 12, 15, 17};
        int target = 3;

        int index = helperBS(arr, target);
        System.out.println(index);
    }
}