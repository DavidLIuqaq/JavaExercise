package com.atdavid.exer2;

import java.util.ArrayList;
import java.util.Collection;

public class ListTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)(Math.random()*(122-97+1)+97)+ "");
        }

        System.out.println(list);

        int acount = listTest(list,"a");

    }

    public static int listTest(Collection list,String s){
        int count = 0;
        for (Object obj:list) {
            if (s.equals(obj)){
                count++;
            }
        }
        return count;
    }
}
