package com.pb.bondar.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WrongLoginException extends Exception {
    private String login;
    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public WrongLoginException(String login) {
        this.login = login;
    }

    public void getLogin() {
        System.out.println(login);
        System.out.println("Пройдите регистрацию занова");

    }
    public void getLogin1() {
        System.out.println(login);
        System.out.println("Повторите вход!");

    }
}
