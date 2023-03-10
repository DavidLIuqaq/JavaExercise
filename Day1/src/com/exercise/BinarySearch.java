package com.exercise;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,10,15,18,20,22,25,28};
        int target = 9;
        int head = 0;
        int end = arr.length-1;
        while(head <= end){
            int middle = (head + end) /2;
            if (target == arr[middle]){
                System.out.println("位置为"+middle);
                break;
            }else if (target < arr[middle]){
                end = middle-1;
            }else {
                head = middle+1;
            }
        }

    }
}
