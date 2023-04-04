package com.atdavid.exer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingerTest {
    public static void main(String[] args) {
        HashMap singers = new HashMap();
        String singer1 = "周杰伦";
        ArrayList songs1 = new ArrayList();
        songs1.add("霍元甲");
        songs1.add("青花瓷");
        songs1.add("七里香");
        String singer2 = "王力宏";
        ArrayList songs2 = new ArrayList();
        songs2.add("需要人陪");

        singers.put(singer1,songs1);
        singers.put(singer2,songs2);

        Iterator iterator = singers.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
