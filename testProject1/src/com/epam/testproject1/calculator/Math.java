package com.epam.testproject1.calculator;

/**
 * Created by dzianis_paulavets on 3/27/17.
 */
public class Math {
    int operation;
    int c = 0;

    public Math(int operation) {
        this.operation = operation;
    }

    public int calculation (int a, int b) {
        switch (operation){
            case 1:
                c = a + b;
                break;

            case 2:
                c = a - b;
                break;

            case 3:
                c = a * b;
                break;

            case 4:
                c = a / b;
                break;

            case 5:
                break;
        }
        return c;
    }
}
