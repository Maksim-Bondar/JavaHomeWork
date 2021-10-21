package com.pb.bondar.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){

        System.out.println("Введите массив из 10 чисел");
        int [] array = new int[10];
        int sum=0;
        int kolvo=0;
        Scanner ar = new Scanner(System.in);
        for (int i=0; i<array.length;i++)
        {
            array[i] = ar.nextInt();
        }
        System.out.println("Вывод введенного массива");
        for (int j=0; j<array.length; j++)
        {
            System.out.println(array[j]);
            sum = sum+array[j];
            if(array[j]>0){
                kolvo ++;
            }
        }
        System.out.println("Сумма элементов массива = "+sum);
        /*for (int i=0; i<array.length;i++){
            if(array[i]>0){
                kolvo ++;
            }
        }*/
        System.out.println("Количество положительных элементов = " + kolvo);
        for(int out=array.length-1; out>=0;out--){
            for(int a =0; a<out;a++){
                if(array[a]>array[a+1]){// при данном условии меняем элементы местами
                    int vrem=array[a];//присваиваем временной переменной значение 0-ого элемента
                    array[a]=array[a+1];//присваиваем 0-ому элементу значение 1-ого
                    array[a+1]=vrem;//присваиваем 1-ому элементу значение 0-ого сохраненного во временной переменной
                }
            }
        }
        System.out.println("Вывод отсортированного массива: ");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
}
