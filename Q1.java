package com.Assignment_1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " " + "is Even Number");
        }

        if (number % 2 == 1) {
            System.out.println(number + " " + "is odd number");
        }
    }
}