package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        radius = in.nextDouble();

        while (radius <= 0) {
            System.out.println("A radius must be a positive, nonzero number.");
            radius = in.nextDouble();
        }

        area = Math.PI * radius * radius;
        area = Math.round(area * 100);
        area = area / 100;
        System.out.println("Your circle's area is:  " + area);

    }
}
