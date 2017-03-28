package com.epam.testproject1;

import java.util.Random;

/**
 * Created by dzianis_paulavets on 3/28/17.
 */
public class zeros_intstead_negatives {

    public static void main(String[] args) {

        //initialize massiv
        int[] massiv = new int[20];

        Random rnd = new Random();

        //create massiv
        for (int i = 0; i < massiv.length; i++){
            massiv[i] = (rnd.nextInt(20)-10);
            System.out.print(massiv[i] + " ");
        }

        System.out.println();

        //replace negatives with ZEROs
        for (int i = 0; i < massiv.length; i++){
            if(massiv[i] < 0){
                massiv[i] = 0;
            }
            System.out.print(massiv[i] + " ");
        }

    }
}
