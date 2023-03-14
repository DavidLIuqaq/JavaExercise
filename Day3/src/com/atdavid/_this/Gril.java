package com.atdavid._this;

public class Gril {
    private String name;
    private int age;

    public void setName(String i){
        this.name = i;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int i){
        this.age = i;
    }

    public int getAge(){
        return this.age;
    }

    public Gril(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    public int compare(Gril gril){
        if(this.age > gril.age){
            return 1;
        }else if(this.age<gril.age){
            return -1;
        }else{
            return 0;
        }
    }

}
