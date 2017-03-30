package com.epam.testproject1.massives;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dzianis_paulavets on 3/27/17.
 *
 * поиск минимального и максимального
 *
 */
public class massives_min_max {
    public static void main(String[] args) {
        int[] massive = new int[20];
        Random x = new Random();

        System.out.print("Массив: ");
        //заполнение массива по порядку
        for (int i = 0; i < 20; i++){
            massive[i] = (x.nextInt(20)-10);
            System.out.print(massive[i] + " ");
        }
        System.out.println();

        int min_chislo = massive[0];
        int min_poziciya = 0;
        int max_chislo = 0;
        int max_poziciya = 0;

        for (int i = 1; i < 20; i++){
            if (min_chislo > massive[i]){
                min_chislo = massive[i];
                min_poziciya = i;
            }
            if (max_chislo < massive[i]){
                max_chislo = massive[i];
                max_poziciya = i;
            }
        }
        System.out.println("минимальное число: " + min_chislo);
        System.out.println("позиция минимального числа: " + (min_poziciya+1));
        System.out.println("максимальное число: " + max_chislo);
        System.out.println("позиция максимального числа: " + (max_poziciya+1));

    }
}
