package com.two;

public class TwoArrayTest {
    public static void main(String[] args){
        //声明
        int[][] arr2 = new int[][]{{1,2,3},{1,2,3}};//静态
        int[][] arr3 = new int[3][];//动态
        int[][] arr4 = new int[3][3];//动态

        String[][] arr5 = new String[3][];

        //调用
        int ar4[][] = new int[4][];
        ar4[0] = new int[5];


        //遍历
        for (int i=0;i<arr2.length;i++){
            for ( int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }



    }
}
