package com.epam.testproject1.calculator;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by dzianis_paulavets on 3/24/17.
 */
public class Calculator {

    public static void main(String[] args) {
        int x = 0;
        int a = 0;
        int b = 0;

        System.out.println("Hello!");
        System.out.println("1 - perform sum of a and b");
        System.out.println("2 - perform subtraction of a and b");
        System.out.println("3 - perform multiplication of a and b");
        System.out.println("4 - perform devision of a and b");
        System.out.println("0 - exit");

        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        Math calculate = new Math(x);

            if (x != 0) {
                System.out.println("Enter a: ");
                a = in.nextInt();

                System.out.println("Enter b: ");
                b = in.nextInt();

                int resultat;
                resultat = calculate.calculation(a, b);

                System.out.println("Результат вашей операции = " + resultat);

            } else System.out.println("До свидания!");
            while (x != 0){
                x = in.nextInt();
            }
    }
}