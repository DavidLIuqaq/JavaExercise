package com.objectLearn;

public class person {
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int hout){
        System.out.println("人睡"+hout+"小时");
    }

    public void interests(String hobby){
        System.out.println("人的爱好是"+hobby);
    }
}
