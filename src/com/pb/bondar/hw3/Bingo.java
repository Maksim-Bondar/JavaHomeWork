package com.pb.bondar.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
            System.out.println("Отгадайте число от 0 до 100");
            System.out.println("если желаете завершить введите exit");

            String a;
            int maxstep=1;
            int step =0;// количество попыток
            int chislo = (int)(Math. random()*100); // загаданное число
        //System.out.println(chislo);
            Scanner ch = new Scanner(System.in);
            while(step<maxstep) {
                step++;
                maxstep++;
                a = ch.next();
                if (a.equals("exit")) {
                    System.out.println("Вы вышли из игры");
                    break;
                }
                int i = Integer.parseInt(a);
                if(i>=0&&i<=100) {
                    if (i > chislo) {
                        System.out.println("не угадали,загаданное число меньше введенного, попробуйте еще раз:");
                        System.out.println("если желаете завершить введите exit");
                    }
                    if (i < chislo) {
                        System.out.println("не угадали,загаданное число больше введенного, попробуйте еще раз:");
                        System.out.println("если желаете завершить введите exit");
                    }

                    if (i == chislo) {
                        System.out.println("Вы отгадали, загаданное число с " + step + " попытки, число =" + a);
                        System.out.println("Вы победили, игра закончена");
                        break;
                    }
                }
                else{
                    System.out.println("Внимание! Ваши шансы выиграть стремятся к нулю, введите число от 0 до 100, удачи");
                }
                }


            }

    }
