package com.alpha;

public class bubbleSort {

    static void BubbleSort(int[] arr , int n){
        int i,j,temp;
        boolean swapped ;
        for(i=0;i<n-1;i++){
            swapped = false;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

    }

    static  void printArray(int[] arr){

        for(int value : arr){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr = {1,2,3,5,4};
        int n = arr.length;
        BubbleSort(arr , n);
        printArray(arr);
    }
}
