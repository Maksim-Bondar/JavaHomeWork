package com.pb.bondar.hw8;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;
    private String confirmPassword;


    public void signUp() throws WrongLoginException, WrongPasswordException {
        System.out.println("Придумайте и введите Login(содержит только латинские буквы и цифры) : ");
        Scanner x = new Scanner(System.in);
        login = x.next();
            if (Pattern.matches("[A-Za-z0-9]{5,20}", login)) {
                System.out.println(login + " Login сохранен");
            } else {
                if (!Pattern.matches("[A-Za-z0-9]{1,100}", login)) {
                    throw new WrongLoginException("Вы использовали сторонние символы! Login состоит только из латинских букв и цифр");
                } else {
                    char[] mas1 = login.toCharArray();
                    if (mas1.length < 5 || mas1.length > 20) {
                        if (mas1.length < 5) {
                            throw new WrongLoginException("Длина Logina не соответствует! Вводите больше символов!");
                        }
                        if (mas1.length > 20) {
                            throw new WrongLoginException("Длина Logina не соответствует! Вводите меньше символов!");
                        }
                    }
                }
            }

            System.out.println("Придумайте и введите пароль (неменьше 5 символов латинские буквы и цифры) : ");
            Scanner k = new Scanner(System.in);
            password = k.next();
            for (int f = 0; f <= 5; f++) {
                if (Pattern.matches("\\w{5,}", password)) {
                    System.out.println( " password сохранен");
                    break;
                } else {
                    if (!Pattern.matches("\\w{1,100}", password)) {
                        throw new WrongPasswordException("Вы использовали сторонние символы! Password состоит только из латинских букв и цифр");
                    } else {
                        char[] mas2 = password.toCharArray();
                        if (mas2.length < 5 ) {
                            throw new WrongPasswordException("Длина password не соответствует!","Вводите больше символов!");
                        }

                    }
                }
            }
            System.out.println("повторите пароль: ");
            Scanner newpas = new Scanner(System.in);
            confirmPassword = newpas.next();
            if(confirmPassword.equals(password)){
                System.out.println("регистрация успешна");
            }
            else {
                throw new WrongPasswordException("Введенный пароль не соответствует предыдущему","В следующий раз получится!");
        }
    }

    public void signIn() throws WrongLoginException{
        System.out.println("Введите Login: ");
        Scanner loginvhod = new Scanner(System.in);
        String login1 = loginvhod.next();
        System.out.println("Введите Password: ");
        Scanner passwordvhod = new Scanner(System.in);
        String password1 = passwordvhod.next();
            if (password1.equals(password) && login1.equals(login)) {
                System.out.println("Поздравляем вход успешный");
            } else {
                throw new WrongLoginException("Введен неверный пароль или логин");
        }
    }
}
