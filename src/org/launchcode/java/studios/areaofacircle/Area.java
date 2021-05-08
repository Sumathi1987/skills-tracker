
package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Enter a radius: ");
        boolean status;
        double radius;

        do {

            radius = input.nextDouble();
            if (radius < 0) {

                System.out.print("Please re-enter radius: ");

            }

        } while (radius < 0);


        System.out.println ("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

    }

}