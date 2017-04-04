package com.epam.testproject1.massives;

import java.util.Random;

/**
 * Created by dzianis_paulavets on 3/28/17.
 *
 * В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
 *
 *
 */
public class triple_positive_element_before_negative {

    public static void main(String[] args) {

        //initialize massiv
        int[] massiv = new int[20];

        Random rnd = new Random();

        //create massive
        for (int i = 0; i < massiv.length; i++){
            massiv[i] = (rnd.nextInt(20)-10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        // triple positive elements located before negatives
        for (int i = 0; i < massiv.length-1; i++){
            if (massiv[i] > 0 && massiv[i+1] < 0) {
                System.out.print(massiv[i] + " ");
                massiv[i] *= 3;
            }
        }
        System.out.println();

        //print massiv elements
        for (int i = 0; i < massiv.length; i++){
            System.out.print(massiv[i] + " ");
        }
    }
}
