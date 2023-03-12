package com.exercise;

public class personTest {
    public static void main(String[] args) {


        person p1 = new person();
        p1.name = "Tom";

        p1.age = 25;
        p1.gender = '1';


        int age = p1.showAge();

        System.out.println("age = " + age);
        p1.addAge(2);
        System.out.println(p1.showAge());

    }
}
