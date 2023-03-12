package com.objectLearn;

public class personTest {

    public static void main(String[] args) {
        person p1 = new person();

        p1.name = "David";
        p1.age = 24;
        p1.gender = '1';


        p1.eat();
        p1.sleep(8);
        p1.interests("dance");


    }

}
