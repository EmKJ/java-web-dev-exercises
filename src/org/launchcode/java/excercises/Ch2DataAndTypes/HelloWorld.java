package org.launchcode.java.excercises.Ch2DataAndTypes;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello, what is your name?");
            String name = input.nextLine();
            System.out.println("hello " + name);
        }
    }
}