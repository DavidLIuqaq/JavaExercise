package com.exercise;

public class Exer02 {
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};
        int min = scores[0];
        int max = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (min>scores[i]){
                min = scores[i];
            }

            if (max<scores[i]){
                max = scores[i];
            }

            sum += scores[i];
        }

        int ave = (sum-max-min)/8;

    }
}
