package com.atdavid.exer1;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("David",1001,new MyDate(1998,11,3),18000);
        emps[1] = new HourlyEmployee("Tim",1002,new MyDate(1999,11,3),18000,20);

        for (int i = 0; i < emps.length; i++) {

            System.out.println(emps[i].toString()+"工资为："+ emps[i].earnings());
        }

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString()+"工资为："+ emps[i].earnings());
            System.out.println("请输入当前月份");
            int month = scan.nextInt();
            if (emps[i].getBirthday().getMonth() == month){
                System.out.println("生日快乐");
            }

        }

    }
}
