package com.binarySearch;

public class SIPosition {

    public static int insertPosition(int[] arr , int target){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target){
                return mid + 1;
            } else if (arr[mid]>target) {
                hi = mid - 1;

            }
            else{
                lo = mid + 1;
            }

        }
        return hi + 1;
    }

    static void main() {
        int[] arr ={2,3,4,7,8,9};
        int target = 3;
        int position = insertPosition(arr,target);
        System.out.println(position);

    }
}
