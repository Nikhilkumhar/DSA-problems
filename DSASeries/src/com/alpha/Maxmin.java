package com.alpha;

public class Maxmin {


    public static int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;

    }


    public static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println("hello world");
        int[] nums = {4,2,7,1,9};
        System.out.println(maxValue(nums));
        System.out.println(minValue(nums));
    }
}
