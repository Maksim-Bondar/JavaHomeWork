package com.pb.bondar.hw4;

import com.pb.bondar.hw3.Array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String fraza1 = vVod();
        String fraza2 = vVod();
        String fra1= izmenenie(fraza1);
        String fra2= izmenenie(fraza2);

//        System.out.println(fra1);
//        System.out.println(fra2);

        srawnenie(fra1,fra2);

        }

    static String vVod() {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String viv = x.nextLine();
        return viv;
    }

    static  String izmenenie(String str1){
        char[] mas1 = str1.toLowerCase(Locale.ROOT).toCharArray();
        for (int k = 0; k < mas1.length; k++) {
            if (mas1[k] == '-' || mas1[k] == ',' || mas1[k] == '.'||mas1[k] == '?'||mas1[k] == '!') {
                mas1[k] = '\t';
            }
        }
        String str = String.valueOf(mas1);
        str = str.replaceAll("\\s+","");
        return str;
    }

    static void srawnenie(String a, String b){
        char[] mas1 = a.toLowerCase(Locale.ROOT).toCharArray();
        char[] mas2 = b.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(mas1);
        Arrays.sort(mas2);
        if(Arrays.equals(mas1,mas2)){
            System.out.println("Фразы являются анаграмами");
        }
        else {
            System.out.println("Фразы не являются анаграмами");
        }
    }
}
