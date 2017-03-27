package com.epam.testproject1.calculator;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/**
 * Created by dzianis_paulavets on 3/24/17.
 */
public class Calculator {

    public static void main(String[] args) {
        int x = 0;
        int a=0;
        int b=0;

        System.out.println("Hello!");
        System.out.println("Please enter desired operation:");
        System.out.println("1 - take sum of a and b");
        System.out.println("2 - take subtraction of a and b");
        System.out.println("3 - take multiplication of a and b");
        System.out.println("4 - take devision of a and b");
        System.out.println("0 - exit");

        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        System.out.println(x);
        Math calculate = new Math(x);

        calculate.operation(a, b);

    }
}
