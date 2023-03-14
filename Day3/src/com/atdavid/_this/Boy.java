package com.atdavid._this;

public class Boy {

    private String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Gril gril){
        System.out.println("我想娶"+gril.getName());
    }

    public void shout(){
        if (this.age>=22){
            System.out.println("我可以结婚了");
        }else {
            System.out.println("我不能结婚");
        }
    }

}
