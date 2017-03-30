package com.epam.testproject1.strings;

import java.util.ArrayList;

/**
 *
 * проверяем как работает split
 *
 */

public class proveryaem_split {
    public static void main(String[] args) {

        String stroka = "a as asd asdf";
        ArrayList<String> massive = new ArrayList<String>(4);
        for (String retval : stroka.split(" ", 0)){
            massive.ensureCapacity(+1);
            massive.add(retval);
        }
        System.out.println(massive);



    }
}
