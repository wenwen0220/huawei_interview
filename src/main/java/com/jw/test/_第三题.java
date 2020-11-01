package com.jw.test;

import java.util.Scanner;

/**
 * Created by jww on .
 * Describe
 *
 * 最长公共字串，两个字串index差加起来小于5
 *
 * xxcdefg
 * cdefghi
 * 5
 * +起来小于5
 */
public class _第三题 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){

            String str1=scan.next();
            int length=str1.length();
            String str2=scan.next();
            //和的上线
            int sum=scan.nextInt();

            int[] dp=new int[length];

            for (int i = 0; i < dp.length; i++) {
                String r="";
                for(int j=0;j<i;j++){
                    char c1=str1.charAt(i),c2=str1.charAt(i+1);
                    if((c1-c2)==1){
                        r+=c1;
                    }
                }
            }
        }
    }
}
