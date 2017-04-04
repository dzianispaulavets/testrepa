package com.epam.testproject1.massives;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dzianis_paulavets on 3/28/17.
 *
 * В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
 *
 */
public class more_one_time {
    public static void main(String[] args) {
        // get size of desired massive
        System.out.println("Hi! Please enter size of massive below");
        Scanner msg = new Scanner(System.in);

        int msize = msg.nextInt();
//        System.out.println(msize);

        // initialize massive with desired size
        int[] massiv = new int[msize];

        // generation of elements of the massiv
        Random rnd = new Random();
        for (int i = 0; i < massiv.length; i++){
            massiv[i] = (rnd.nextInt(20)-10); // fill with random elements
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //считаем сколько элементов повторяются и выводим все повторки на нечетных местах
        for (int i = 0; i < msize; i++){
            for(int j = msize-1; j >= 0; j--){
                if(massiv[i] == massiv [j] && i != j && j > i){
                    if(i%2!=0){
                        System.out.println("noneven position = " + i + " number = " + massiv[i]);
                    }
                    if (j%2!=0) {
                        System.out.println("noneven position = " + j + " number = " + massiv[j]);
                    }
                    if(i%2 == 0) {
                        System.out.println("even position = " + i + " number = " + massiv[i]);
                    }
                    if (j%2 == 0){
                        System.out.println("even position = " + j + " number = " + massiv[j]);
                    }
                }
            }
        }
    }
}
