package com.alpha;

public class ReverseArray {

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1, 4, 0, 5, -2, 15};
        int[] brr = {2, 6, 3, 9, 4};

        reverse(arr);
        reverse(brr);

        printArray(arr);
        printArray(brr);
    }
}
