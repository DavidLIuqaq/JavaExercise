package com.atdavid.exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("请录入学生信息：");
        Scanner scanner = new Scanner(System.in);

        List list = new ArrayList();

        while(true){
            System.out.println("1：继续录入，0：结束录入");
            int selection = scanner.nextInt();
            if (selection == 0){
                break;
            }

            System.out.println("请输入学生姓名");
            String name = scanner.next();
            System.out.println("请输入学生年龄");
            int age = scanner.nextInt();

            Student s = new Student(name,age);

            list.add(s);
        }

        System.out.println("遍历学生信息");

        for (Object s:
             list) {
            System.out.println(s.toString());
        }
        scanner.close();
    }
}
