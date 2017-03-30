package com.epam.testproject1.strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
 */
public class words_minimal_symbols {
    public static void main(String[] args) {
        int massiv_size = 0;
        Scanner scn = new Scanner(System.in);
        ArrayList<String> massiv = new ArrayList<String>(massiv_size);

        System.out.println("Hello!");
        System.out.println("Enter a sentence separating words by SPACE.");
        System.out.println("Finish entering by pressing ENTER button on the keyboard.");

        String input = scn.nextLine();
        char symbol;

        int index = 1;

        while(index != 0){
            int n_spaces = 0;
            // spaces on first and last places are excluded
            if (input.indexOf(" ") > 0 && input.indexOf(" ") <= input.length()){
                index = input.indexOf(" ");
                // here is check for additional spaces
                while (input.charAt(index+1) == input.charAt(index)){
                    index++;
                    n_spaces++;
                }
                massiv.add(input.substring(0,index-n_spaces));
                massiv.ensureCapacity(massiv_size+1);
                System.out.println("index of next first SPACE is: " + input.indexOf(" "));
                input = input.substring(index+1,input.length());
            }
            else{
                massiv.add(input);
                index = 0;
            }
        }
        System.out.println(massiv);
        System.out.println("# of words entered = " + massiv.size());

        /*
        *
        * Here will be the code which finds words with most different symbols inside
        *
        * */
        ArrayList<String> str = new ArrayList<String>(0);
        ArrayList<Integer> pos = new ArrayList<Integer>(0);
        ArrayList<Integer> symbols = new ArrayList<Integer>(0);
        String melement;
        for (int i =0; i< massiv.size(); i++){
            melement = massiv.get(i);
            for (int j = 0; j < melement.length(); j++){
                for (int f = melement.length()-1; f > j && ; f--){

                }
            }
        }

    }
}