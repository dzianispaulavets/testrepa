package com.epam.testproject1.strings;

import java.util.Scanner;

/**
 * Created by dzianis_paulavets on 3/28/17.
 *
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 *
 *
 */
public class strings_lenght {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Type sentences separating by new lines (pressing Enter)");
        System.out.println("Type Result to show minimal and maximal lines with their length");
        System.out.println("Type Exit to finish");

        String x = "";

        String minimal = " ";
        String maximal = " ";

        Scanner scn = new Scanner(System.in);
        x = scn.nextLine();
        minimal=x;

        while (!x.equals("Exit") && !x.equals("Result")){

            if (!x.equals("Exit") && !x.equals("Result")){
                System.out.println("Entered " + x.length() + " symbols");
            }
            if(x.length() < minimal.length()){
                minimal = x;
            }
            if(x.length() > maximal.length()){
                maximal = x;
            }
            x = scn.nextLine();
        }
        System.out.println();
        if (x.equals("Result")){
            if(!minimal.equals("Result")) {
                System.out.println("minimal string = " + minimal + ". Number of symbols in the string = " + minimal.length());
            }
            if(!maximal.equals("Result")) {
                System.out.println("maximal string = " + maximal + ". Number of symbols in the string = " + maximal.length());
            }
            else{
                System.out.println("String was not entered");
            }
        }
        System.out.println("Bye!");




    }
}
