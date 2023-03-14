package com.valuetransfer;

public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle, 5);
        System.out.println(circle.radius);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t" + c.findArea());
        }

        c.radius = i++;
    }
}
