/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final int CONVERSION_RATE = 350;
        int length;
        int width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length:");
        length = scanner.nextInt();

        System.out.println("Width:");
        width = scanner.nextInt();

        scanner.close();

        double area = length * width;
        System.out.printf("You will to purchase %d gallons of paint to cover %d square feet.", (int)Math.ceil(area / CONVERSION_RATE), length * width);
    }
}
