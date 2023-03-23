package com.atdavid.exer5;

public class StringReverse {

    private String str;
    StringReverse(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String reverse(String str, int fromIndex, int toIndex){
        char[] arr = str.toCharArray();
        char tmp = ' ';
        while(fromIndex < toIndex){
            tmp = arr[fromIndex];
            arr[fromIndex] = arr[toIndex];
            arr[toIndex] = tmp;
            fromIndex++;
            toIndex--;
        }
        return new String(arr);
    }
}


