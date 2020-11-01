package com.jw.test;

import java.util.Arrays;

/**
 * Created by jww on .
 * Describe
 */
public class test2 {
    public static void main(String[] args) {
        int[] ints=new int[10];
        ints[1]=1;
        ints[2]=5;
        ints[4]=5;
        ints[3]=1;
//        for (int i : ints) {
//            System.out.println(i);
//        }

        int[] ints1=Arrays.copyOf(ints,1000);
        System.out.println(ints);
        System.out.println(ints1);
        Arrays.sort(ints);

//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
    }
}
