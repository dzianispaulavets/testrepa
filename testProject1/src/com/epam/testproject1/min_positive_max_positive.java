package com.epam.testproject1;

import java.util.Random;

/**
 * Created by dzianis_paulavets on 3/27/17.
 *
 * - В массиве целых чисел поменять местами максимальный отрицательный элемент  и минимальный положительный.
 *
 */
public class min_positive_max_positive {
    public static void main(String[] args) {

        int[] massive = new int[20];

        Random rndm = new Random();

        System.out.print("массив: ");
        // генерация массива
        for (int i = 0; i <= 19; i++) {
            massive[i] = (rndm.nextInt(20) - 10);
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        // определяем максимальное отрицательное
        int chislo1 = -10;
        int position1 = 0;

        for (int i = 0; i < 20; i++) {
            if (massive[i] < 0) {
                if(massive[i] > chislo1){
                    chislo1 = massive[i];
                    position1 = i;
                }
            }
        }
        System.out.print("максимальное отрицательное "+ chislo1 + " позиция " + (position1+1) + " ");
        System.out.println();


        // определяем минимальное положительное
        int chislo2 = 10;
        int position2 = 0;
        for (int i = 0; i < 20; i++) {
            if (massive[i] > 0) {
                if(massive[i] < chislo2){
                    chislo2 = massive[i];
                    position2 = i;
                }
            }
        }
        System.out.print("минимальное положительное "+ chislo2 + " позиция " + (position2+1) + " ");
        System.out.println();
        System.out.print("измененный массив: ");

        // замена минимального на максимальное
        massive[position1] = chislo2;
        massive[position2] = chislo1;
        for (int i = 0; i < 20; i++){
            System.out.print(massive[i] + " ");
        }
    }
}
