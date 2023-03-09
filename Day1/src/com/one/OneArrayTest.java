package com.one;

public class OneArrayTest {

    public static void main(String args[]){
        //声明
        int num1 = 10;
        int num2;
        num2 =20;

        double[] prices;
        //静态初始化：数组变量赋值与数组元素赋值 同时进行
        prices = new double[]{20,32,4,56,78,21};
        //String[] foods;
        //foods = new String[]{"拌海蜇","但炒面"};

        //动态初始化： 分开进行
        String[] foods = new String[4];
        int arr[] = new int[4];
        int[] arr1 = new int[4];



        //调用
        //长度
        System.out.println(prices.length);



    }
}
