package com.binarySearch;

public class FirstOcc {
    public static int firstOccurrence(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target){
                ans = mid;
                hi = mid - 1;
            } else if (arr[mid]>target) {
                hi = mid - 1;
            }
            else {
                lo = mid +1;
            }

        }
        return  ans;
    }

    static void main() {
        int[] arr ={2,3,4,7,9,9};
        int target = 9;
        int Fidx = firstOccurrence(arr,target);
        System.out.println(Fidx);
    }
}
