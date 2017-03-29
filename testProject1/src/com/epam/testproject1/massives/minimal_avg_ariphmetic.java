package com.epam.testproject1.massives;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dzianis_paulavets on 3/28/17.
 *
 * - В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
 *
 */
public class minimal_avg_ariphmetic {

    public static void main(String[] args) {

        // get size of desired massive
        System.out.println("Hi! Please enter size of massive below");
        Scanner msg = new Scanner(System.in);

        int msize = msg.nextInt();
//        System.out.println(msize);

        // initialize massive with desired size
        float[] massiv = new float[msize];

        // generation of elements of the massiv
        Random rnd = new Random();
        for (int i = 0; i < massiv.length; i++){
            massiv[i] = (rnd.nextInt(20)-10); // fill with random elements
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        // find average ariphmetic
        float avgArphmIntermediate = 0;
        float avgArphmFinal = 0;
        for(int i = 0; i < massiv.length; i++){
            avgArphmIntermediate += massiv[i];
        }
        System.out.println();
        avgArphmFinal = avgArphmIntermediate/massiv.length;
        System.out.println("Average ariphmetic value = " + avgArphmFinal);

        //find minimal element
        float min = 100;
        for(int i = 0; i < massiv.length; i++){
            if(massiv[i] < min){
                min = massiv[i];
            }
        }
        System.out.println("Minimal value = " + min);



        float finalResult = 0;

        if(avgArphmFinal < min){
            finalResult = avgArphmFinal - min;
        }
        else{
            finalResult = min - avgArphmFinal;
        }

        System.out.println(Math.abs(finalResult));

    }
}
