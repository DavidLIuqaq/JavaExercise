package com.exercise;

public class Exer01 {
    public static void main(String[] args){
        int max;
        int min;
        double ave=0;
        int sum=0;


        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(99-10+1))+10;
        }


        max = arr[0];
        min = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }

            if(min>arr[i]){
                min = arr[i];
            }
            sum+= arr[i];


        }
        ave = sum/10;

        System.out.println(max+" "+min+" "+ave+" "+sum+" ");

    }

}
