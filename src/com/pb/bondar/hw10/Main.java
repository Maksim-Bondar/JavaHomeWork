package com.pb.bondar.hw10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массив данных Integer");
        System.out.println();
        NumBox<Integer> mas = new NumBox<Integer>(5);
        try {
            mas.add(0, 1);
            mas.add(1, 2);
            mas.add(2, 20);
            mas.add(3, 4);
            mas.add(4, 5);
        } catch (Exception x) {
            System.out.println("Массив уже заполнен!");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Получаем значение " + i + " элемента " + mas.get(i));
        }
        System.out.println("Сумма элементов массива равна: " + mas.sum());
        System.out.println("Количество элементов в массиве: "+mas.length());
        System.out.println("Среднее значение элементов: "+mas.average());
        System.out.println("Максимальное значение: "+mas.max());
        System.out.println();

        System.out.println("Массив данных Float");
        System.out.println();
        NumBox<Float> masFloat = new NumBox<Float>(5);
        try {
            masFloat.add(0, 1.5F);
            masFloat.add(1, 2.8F);
            masFloat.add(2, 20.9F);
            masFloat.add(3, 4.9F);
            masFloat.add(4, 5.3F);
        } catch (
                Exception x) {
            System.out.println("Массив уже заполнен!");
        }

        for (
                int i = 0;
                i < 5; i++) {
            System.out.println("Получаем значение " + i + " элемента " + masFloat.get(i));
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна: " + masFloat.sum());
        System.out.println("Количество элементов в массиве: "+masFloat.length());
        System.out.println("Среднее значение элементов: "+masFloat.average());
        System.out.println("Максимальное значение: "+masFloat.max());
    }
}

