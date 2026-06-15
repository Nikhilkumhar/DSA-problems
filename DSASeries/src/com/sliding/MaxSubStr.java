package com.sliding;

import java.util.ArrayList;

public class MaxSubStr {

    static long maximumSubArray(int K, ArrayList<Integer> Arr){
        long maxSum = 0;
        long sum = 0;
        int index =0;
        int N = Arr.size();
        while(index<N && index<K){
            sum += Arr.get(index);
            index++;
        }
        maxSum = sum;
        for(int i=1;i<N-K+1;i++){
            int prevElement = Arr.get(i-1);
            int nextElement = Arr.get(i+K-1);
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(1);
        Arr.add(3);
        Arr.add(4);
        Arr.add(7);
        Arr.add(9);
        long max = maximumSubArray(3,Arr);
        System.out.println(max);

    }
}
