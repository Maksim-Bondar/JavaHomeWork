package com.pb.bondar.hw9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class FileNumbers {
    public static void main(String[] args) throws Exception {
        System.out.println("Создаем массив случайных чисел...");
        int[][] maschisel = new int[10][10];
        Random ran = new Random();
        for (int i = 0; i < maschisel.length; i++) {
            for (int j = 0; j < maschisel.length; j++) {
                maschisel[i][j] = ran.nextInt(100);
            }
        }
        System.out.println("Записываем массив в файл...");
        createNumbersFile(maschisel);
        System.out.println("Данные в файле numbers.txt");
        readerNumbersFile();
        System.out.println("Заменяем четные значения на 0 и записываем в новый файл...");
        createOddNumbersFile();
        System.out.println("Данные в новый файле odd-numbers.txt");
        readerOddNumbersFile();


    }


    public static void createNumbersFile(int mas[][]) throws Exception {
        try (BufferedWriter fl = new BufferedWriter(new FileWriter("files\\numbers.txt"))) {
            for (int i = 0; i < mas.length; ++i) {
                for (int j = 0; j < mas.length; ++j) {
                    String str = Integer.toString(mas[i][j]);
                    fl.write(str + " ");
                }
                fl.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void createOddNumbersFile() throws Exception {
        try (BufferedReader flread = new BufferedReader(new FileReader("files\\numbers.txt"))) {
            //Считываем и модернизируем файл
            Scanner scan = new Scanner(flread);
            int[][] tr = new int[10][10];//массив куда выводятся данные из файла
            for (int i = 0; i < tr.length; i++) {
                for (int j = 0; j < tr.length; j++) {
                    tr[i][j] = scan.nextInt();
                    if ((tr[i][j] % 2) == 0) {
                        tr[i][j] = 0;
                    }
                }
            }
            //Записываем измененные данные в новый файл
            try (BufferedWriter flwriter = new BufferedWriter(new FileWriter("files\\odd-numbers.txt"))) {
                for (int i = 0; i < tr.length; ++i) {
                    for (int j = 0; j < tr.length; ++j) {
                        String str = Integer.toString(tr[i][j]);
                        flwriter.write(str + " ");
                    }
                    flwriter.newLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception y) {
            y.printStackTrace();
        }
    }

    public static void readerNumbersFile() throws Exception {
        try (BufferedReader flread = new BufferedReader(new FileReader("files\\numbers.txt"))) {
            //Считываем и модернизируем файл
            Scanner scan = new Scanner(flread);
            int[][] tr = new int[10][10];//массив куда выводятся данные из файла
            for (int i = 0; i < tr.length; i++) {
                for (int j = 0; j < tr.length; j++) {
                    tr[i][j] = scan.nextInt();
                    System.out.print(tr[i][j] + " ");
                }
                System.out.println();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка файл не считан!");
            ex.printStackTrace();
        }
    }
    public static void readerOddNumbersFile() throws Exception {
        try (BufferedReader flread = new BufferedReader(new FileReader("files\\odd-numbers.txt"))) {
            //Считываем и модернизируем файл
            Scanner scan = new Scanner(flread);
            int[][] tr = new int[10][10];//массив куда выводятся данные из файла
            for (int i = 0; i < tr.length; i++) {
                for (int j = 0; j < tr.length; j++) {
                    tr[i][j] = scan.nextInt();
                    System.out.print(tr[i][j] + " ");
                }
                System.out.println();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка файл не считан!");
            ex.printStackTrace();
        }
    }
}

