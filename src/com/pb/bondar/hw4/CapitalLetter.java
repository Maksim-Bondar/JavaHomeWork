package com.pb.bondar.hw4;

import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String fraza = vVod();
        reGistr(fraza);
    }

    //ввод фразы
    static String vVod() {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String viv = x.nextLine();
        return viv;
    }

    // изменение регистра символов и вывод измененной фразы
    static void reGistr(String fraza) {
        char[] simMas = fraza.toCharArray();
        simMas[0] = Character.toUpperCase(simMas[0]);
        for (int k = 0; k < simMas.length; k++) {
            if (simMas[k] == ' ' || simMas[k] == ','||simMas[k] == '.') {
                simMas[k + 1] = Character.toUpperCase(simMas[k + 1]);
            }
        }
        System.out.println("Введенная фраза: \n");
        System.out.println(simMas);
    }
}
