package com.pb.bondar.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("введите целое число 'a' и нажмите Enter");
        operand1 = scan.nextInt();
        System.out.println("Введите целое число 'b' и нажмите Enter");
        operand2 = scan.nextInt();
        System.out.println("укажите знак действия которое нужно выполнить с числами(и нажмите Enter):");
        System.out.println("- сложение (+)");
        System.out.println("- вычитание (-)");
        System.out.println("- деление (/)");
        System.out.println("- умножение (*)");
        sign = scan.next();
        char c = sign.charAt(0);
        switch (c) {
            case '+':
                System.out.println("Результат выполнения действия   =" + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат выполнения действия   =" + (operand1 - operand2));
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("делить на 0 нельзя, введите корректное число");
                    operand2 = scan.nextInt();
                    System.out.println("Результат выполнения действия   =" + (operand1 / operand2));
                } else {
                    System.out.println("Результат выполнения действия   =" + (operand1 / operand2));
                }
                break;
            case '*':
                System.out.println("Результат выполнения действия   =" + (operand1 * operand2));
                break;
        }
    }
}
