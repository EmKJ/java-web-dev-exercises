package org.launchcode.excercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you travel?");
        int miles = input.nextInt();
        System.out.println("how many gallons did it take?");
        int gallons = input.nextInt();
        System.out.println("Your MPGs were: " + (miles / gallons));
        input.close();
    }
}
