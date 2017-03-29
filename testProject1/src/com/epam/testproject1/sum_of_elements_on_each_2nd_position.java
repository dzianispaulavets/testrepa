package com.epam.testproject1;

import java.util.Random;

/**
 * Created by dzianis_paulavets on 3/27/17.
 *
 * - В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
 *
 */
public class sum_of_elements_on_each_2nd_position {
    public static void main(String[] args) {
        int[] massiv = new int[20];

        Random rnd = new Random();
        int value = rnd.nextInt(10);

        // massive generation
        for (int i = 0; i < 20; i++){
            massiv[i] = (rnd.nextInt(20)-10);
            System.out.print(massiv[i] + " ");
        }

        System.out.println();

        // sum of each 2nd element except of 0
        int sum = 0;
        for (int i = 1; i < massiv.length; i++){
            if ((i+1) % 2 == 0){
                sum += massiv[i];
                System.out.print(massiv[i] + " ");

            }
        }
        System.out.println();
        System.out.print("summa " + sum);

    }
}
