package com.company;

public class Main {

    public static void main(String[] args) {
        Circle firstCircle = new Circle(2);
        System.out.println("area of first circle is " + firstCircle.getArea());
        System.out.println("");

        Cylinder firstCylinder = new Cylinder(2,2);
        System.out.println("area of first cylinder is " + firstCylinder.getVolume());
    }
}
