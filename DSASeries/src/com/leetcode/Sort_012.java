package com.leetcode;

import java.util.Scanner;

public class Sort_012 {

    public static void sortColors(int[] nums) {

        int[] counts = new int[3];

        for (int num : nums) {
            counts[num]++;
        }

        int index = 0;

        for (int i = 0; i < counts[0]; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < counts[1]; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < counts[2]; i++) {
            nums[index++] = 2;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sortColors(nums);


        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
