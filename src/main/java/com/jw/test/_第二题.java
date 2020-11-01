package com.jw.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jww on .
 * Describe
 * 一组数中出现次数最多的数叫众数，众数可以有多个，
 * 先取出众数，再取出众数的中位数，数组范围0<n<1000,
 * 2 1 5 4 3 3 9 2 7 4 6 2 15 4 2 4
 */
public class _第二题 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String[] strings = str.split(" ");
            List<Integer> list = new ArrayList<>();

            int[] ints = new int[1000];

            for (String string : strings) {
                int index = Integer.parseInt(string);
                ints[index]++;
            }
            int[] ints1 = Arrays.copyOf(ints, 1000);
            Arrays.sort(ints);
            int max = ints[999];
            for (int i = 0; i < 1000; i++) {
                if (ints[i] == max) {
                    list.add(i);
                }
            }

            if (list.size() % 2 == 0) {
                int mid = list.size() / 2;
                System.out.println((list.get(mid - 1) + list.get(mid)) / 2);
            } else {
                System.out.println(list.get(list.size() / 2));
            }

        }
        scan.close();
    }
}
