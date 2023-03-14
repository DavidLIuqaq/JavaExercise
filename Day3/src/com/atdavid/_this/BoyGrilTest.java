package com.atdavid._this;

public class BoyGrilTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Jack",24);
        Gril gril1 = new Gril("Rose",20);

        gril1.marry(boy1);
        boy1.shout();

        Gril gril2 = new Gril("小三",18);

        int compare = gril1.compare(gril2);

    }
}
