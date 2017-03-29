package com.epam.testproject1.massives;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by dzianis_paulavets on 3/23/17.
 */

public class Massives {

    public static void main(String[] args)
    {
        int[][] massive2d = new int[5][5];
        int value = 0;
        for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 4; j++){
                    massive2d[i][j]=value;
                    value++;
                    System.out.print(massive2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
