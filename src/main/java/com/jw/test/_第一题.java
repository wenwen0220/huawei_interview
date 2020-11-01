package com.jw.test;

import java.util.*;

/**
 * Created by jww on .
 * Describe  单词接龙，第一个输入是从第几个单词开始拼接，第二个是单词个数，
 * 拼接规则，单词最后一个字符与下一个单词的首字符相同则拼接，优先拼接长度最长的单词，如果又多个一样长度的单词，则按字典序排序，取第一个
 * 如下：
 *
 * 0
 * 6
 * word
 * dd
 * da
 * dc
 * dword
 * d
 *
 * 输出 worddwordda
 */
public class _第一题 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int index = scan.nextInt();
            int num = scan.nextInt();

            List<String> list = new ArrayList<String>();
            for (int i = 0; i < num; i++) {
                String str = scan.next();
                list.add(str);
            }
            StringBuffer sb = new StringBuffer();
            String first = list.get(index);

            for (int j = 0; j < num; j++) {
                sb.append(first);
                list.remove(first);
                List<String> list1 = new ArrayList<String>();
                for (int i = 0; i < list.size(); i++) {
                    String str1 = list.get(i);
                    if (str1.charAt(0) == first.charAt(first.length() - 1)) {
                        list1.add(str1);
                    }
                }
                if (list1.isEmpty()) {
                    break;
                } else {
                    list1.sort(new Comparator<String>() {
                        public int compare(String o1, String o2) {
                            if (o1.length() == o2.length()) {
                                return o1.compareTo(o2);
                            }
                            return o2.length() - o1.length();
                        }
                    });

                    first = list1.get(0);
                }
            }
            System.out.println(sb.toString());
        }
        scan.close();
    }
}
