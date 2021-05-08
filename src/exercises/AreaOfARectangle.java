package exercises;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        double length = input.nextDouble();

        System.out.println ("Enter the height of the rectangle:");
        double height = input.nextDouble();

        System.out.println ("The area of a rectangle with height " + height + " and length " + length + " is " + height*length + '.');

    }

}

