package com.epam.testproject1.strings;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Doesn't work! correctly...
 *
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
                input = input.substring(index+1,input.length());
            }
            else{
                massiv.add(input);
                index = 0;
            }
        }
        System.out.println("Words separated in massive: " + massiv);
        System.out.println("# of words entered = " + massiv.size());

        /*
        *
        * Here will be the code which finds words with most different symbols inside
        *
        * */
        ArrayList<Integer> msymbols = new ArrayList<Integer>(0);
        String melement = "";
        int flag = 0;
        //проверка каждого слова
        //Variant I
        for (int i =0; i< massiv.size(); i++){
            melement = massiv.get(i);
            //начинаем проверку каждой буквы
            for (int j = 0; j < melement.length(); j++){
                for (int f = melement.length()-1; f >= 0; f--){
                    if (melement.charAt(j) == melement.charAt(f) && f != j && f > j){
                        flag++;
                    }
                }
            }

            //проверяем, если количество букв равно количеству символов, т.е. слово содержит только 1 симфол
            // несоклько раз например, то меняем флаг на 1
            if (melement.length() == flag){
                msymbols.add(1);
            }
            else msymbols.add(melement.length()-flag);
            flag=0;
        }
        System.out.println("# of different symbols in each word: " + msymbols);



        // Variant II
//        for (int i = 0; i < massiv.size(); i++){
//            int dlina = massiv_size - flag;
//            for (int j = dlina; j > 0; j--){
//                if()
//            }
//
//        }


        /*
        *
        * Here will be the code which calculate/finds words where # of different symbols is minimum.
        * The formula is the following: (# of symbols in a word / # of differend symbols in the word)
        * We have:
        *  massiv - massive for words entered
        *  msymbols - massive for word's # of different sybmols
        *
        *  Idea is the following:
        *       1. get word from massiv
        *       2. devide #of letters by #of different letters
        *       3. The highest number wins
        *
        *
        * */

        ArrayList<Float> result_massiv = new ArrayList<Float>(massiv.size());
        float resultat;
        for (int i = 0; i < massiv.size(); i++){
            resultat = ((msymbols.get(i))/(massiv.get(i).length()));
            result_massiv.add(resultat);
        }

        System.out.println("<===================>");
        System.out.println(result_massiv);

    }
}