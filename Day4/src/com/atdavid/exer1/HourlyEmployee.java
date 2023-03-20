package com.atdavid.exer1;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earnings(){
        return wage*hour;
    }

    public String toString(){
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
