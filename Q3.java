package com.Assignment_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal value:");
        float principal = input.nextFloat();

        System.out.print("Enter Time period in years:");
        float time = input.nextFloat();

        System.out.println("Enter Rate of Interest :");
        float rate = input.nextFloat();

        float Rate = rate / 100;

        float SimpleInterest = principal * (1 + (Rate*time));

        float Interest = SimpleInterest - principal;

        System.out.println(SimpleInterest + " " + "is the simple interest");
        System.out.println("interest earned:" + Interest);
    }
}
