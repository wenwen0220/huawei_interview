package com.jw.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jww on .
 * Describe
 * 0
 *  * 6
 *  * word
 *  * dd
 *  * da
 *  * dc
 *  * dword
 *  * d
 */
public class test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("dword");
        list.add("dd");
        list.add("dab");
        list.add("dc");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                return o2.length()-o1.length();
            }
        });
        list.remove("dd");
        list.forEach(x-> System.out.println(x));

    }
}
