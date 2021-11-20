package com.pb.bondar.hw8;


public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        System.out.println("Пройдите регистрацию: ");
        for (int i=0;i<=100;i++) {
            try {
                auth.signUp();
                break;
            } catch (WrongLoginException ex) {
                System.out.println("Логин введен не корректно");
                ex.getLogin();
            } catch (WrongPasswordException e) {
                System.out.println("Пароль введен не корректно");
                e.getPassword1();
            }
    }
        System.out.println("Войдите в аккаунт: ");
        int k=3;
        for (int i=0;i<=3;i++){
            k--;
            try {
                auth.signIn();
                break;
            }catch (WrongLoginException y){
                if(k==0){
                    System.out.println("Акаунт заблокирован!");
                    break;
                }
                y.printStackTrace();
                System.out.println("Вход не выполнен!"+"Осталось: "+k+" попытки");
                y.getLogin1();

            }


        }
    }
}
