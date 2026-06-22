package com.binarySearch;

public class CountOcc {

    public static int firstOccurrence(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                ans = mid;
                hi = mid - 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }

        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                ans = mid;
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }

        }
        return ans;
    }

    public static int CountOccurrence(int[] arr, int target) {
        int First_index = firstOccurrence(arr, target);
        if (First_index == -1) {
            return 0;

        }
        int Last_index = lastOccurrence(arr, target);

        return (Last_index - First_index + 1);
    }


    static void main() {
        int[] arr = {2, 3, 4, 7, 9, 9,9};
        int target = 9;
         int count = CountOccurrence(arr,target);
        System.out.println(count);

    }


}
