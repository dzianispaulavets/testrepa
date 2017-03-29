package com.epam.testproject1;

import java.util.Scanner;

/**
 * Created by dzianis_paulavets on 3/28/17.
 *
 * doesn't work
 *
 *
 */
public class strings_lenght {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter # of desired lines: ");
//        int skolko_strok = scn.nextInt();
//
//        String[] stroki = new String[skolko_strok];
//
//        for (int i = 0; i < stroki.length; i++){
//
//        }
//        if (stroki.length < skolko_strok){
//            System.out.println("Please enter more lines");
//        }




        System.out.println("Hello!");
        System.out.println("Type sentences separating by new lines.");
        System.out.println("Type exit to finish");

        String x = "";

        int razmer = 1;


        while (x != "exit"){

            String[] mass = new String[razmer];
            String[] massX = new String[razmer];
            Scanner scn = new Scanner(System.in);
            x = scn.nextLine();
            System.out.println(x);
            razmer++;
            System.out.println(razmer);

            for(int i = 0; i < mass.length; i++){
                
            }
        }




    }
}
