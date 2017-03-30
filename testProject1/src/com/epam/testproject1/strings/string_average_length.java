package com.epam.testproject1.strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
 *
 */
public class string_average_length {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Type sentences separating by new lines (pressing Enter)");
        System.out.println("Type Result to show lines with length more than average");
        System.out.println("Type Exit to finish");

        Scanner scn = new Scanner(System.in);
        String str = ""; //string for scanning input
        int intermediate = 0;
        int avg_size;
        int size = 0;
        ArrayList<String> massiv = new ArrayList<String>(size);

        str = scn.nextLine();
        int min_size = str.length();
        int max_size = str.length();

        //записываем записи в массив
        while (!str.equals("Result") && !str.equals("Exit")){
            massiv.add(str);
            massiv.ensureCapacity(size+1);

            if (str.length() < min_size){
                min_size = str.length();
            }
            if (str.length() > max_size){
                max_size = str.length();
            }
            str = scn.nextLine();
        }
        if(massiv.size()<3){
            System.out.println("You entered not enough lines for the Result");
            System.out.println("Bye!");
        }
        else{
            System.out.println("Result is the following: ");
            System.out.println();
            // рассчитываем длину
            for(int i = 0; i < massiv.size(); i++){
                //System.out.print(massiv.get(i).toString() + " ");
                intermediate += massiv.get(i).length();
            }
            avg_size = intermediate/massiv.size();
            System.out.println("Max size = " + max_size + "| Min size = " + min_size);
            System.out.println("Average line length = " + avg_size);
            System.out.println();

            for (int i = 0; i < massiv.size(); i++){
                if (massiv.get(i).length()>avg_size){
                    System.out.println("Line where length is more than average");
                    System.out.println("==>> " + massiv.get(i) + " <<==");
                    System.out.println("The line length = " + massiv.get(i).length());
                    System.out.println();
                }
            }
            System.out.println("Bye!");
        }

    }
}
