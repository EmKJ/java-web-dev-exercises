package org.launchcode.excercises;

import java.util.Scanner;

/**
 * Rectangle
 */
public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        int length = input.nextInt();
        System.out.println("What is its width?");
        int width = input.nextInt();
        System.out.println("Total area: " + (width * length));
        input.close();
    }
}