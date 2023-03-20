package com.atdavid.exer1;

public class MyDate {
    private int year;
    private int month;
    private int day;
    MyDate(){

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day =day;
    }
    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
