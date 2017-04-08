package com.epam.testproject1.strings;

import com.sun.deploy.util.StringUtils;

import java.util.*;

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
                input = input.substring(index+1,input.length());
            }
            else{
                massiv.add(input);
                index = 0;
            }
        }
//        System.out.println("Words separated in massive: " + massiv);
        System.out.println("# of words entered = " + massiv.size());

        /*
        * Here will be the code which finds words with most different symbols inside
        * */
        ArrayList<Float> msymbols = new ArrayList<Float>(0);
        String melement;

//
//            //проверяем, если количество букв равно количеству символов, т.е. слово содержит только 1 симфол
        /*
        * Below is the code which calculate/finds words where # of different symbols is minimum.
        * The formula is the following: (# of symbols in a word / # of differend symbols in the word)
        * We have:
        *  massiv - massive for words entered
        *  msymbols - massive for word's # of different sybmols
        *
        *  Idea is the following:
        *       1. get word from massiv
        *       2. devide #of letters by #of different letters
        *       3. The highest number wins
        * */

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < massiv.size(); i++) {
            melement = massiv.get(i);
            msymbols.ensureCapacity(+1);
            for (int j = 0; j < melement.length(); j++) {
                if (!map.containsKey(melement.charAt(j))) {
                    map.put(melement.charAt(j), +1);
                } else {
                    int temp = map.get(melement.charAt(j));
                    temp += 1;
                    map.replace(melement.charAt(j), temp);
                }
            }
            msymbols.add((float)melement.length()/map.size());
//            System.out.println(map);
//            System.out.println("количество разных символов = " + map.size());
//            System.out.println(melement.length());
//            System.out.println();
            map.clear();
        }
//        System.out.println(msymbols);


        /*
        Here is the code which finds higher value
         */

        float higher_value = msymbols.get(0);
        String slovo = "";

        for (int i = 0; i < msymbols.size(); i++){
            if (higher_value < msymbols.get(i)){
                higher_value = msymbols.get(i);
                slovo = massiv.get(i);
            }
        }
        System.out.println();
//        System.out.println("самое большое значение = " + higher_value);
        System.out.println("Word with minimal number of different letters = " + slovo);
    }
}