package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        System.out.println(area);
        input.close();
    }
}
