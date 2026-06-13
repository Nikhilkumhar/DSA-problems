package com.alpha;

public class LinearSearch {
    public static int search(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,7,1,9};
        int target = 7;
        int index = search(nums, target);
        System.out.println(index == -1 ? "not found" : "found at index " + index);
    }

}
