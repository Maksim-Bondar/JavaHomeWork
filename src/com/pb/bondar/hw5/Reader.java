package com.pb.bondar.hw5;

public class Reader {
    String fio;
    String number;
    String faculty;
    String date;
    String phoneNumber;
    int kolvo;

    public Reader(String fio,String number,String faculty,String date,String phoneNumber,int kolvo){
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.kolvo = kolvo;
    }


    public void takeBook(String fio, int kolvo){
        if (kolvo==0){
            System.out.println( fio + "не брал книги ");
        }
        else {
            System.out.println(fio + "взял: " + kolvo + " книги.");
        }
    }
    public void takeBook(String fio, String ... names) {
        if (kolvo == 0) {
            System.out.println(fio + "не брал книги ");
        } else {
            System.out.println(fio + "взял книги: ");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
    public void takeBook(BooK... books) {
        if (kolvo == 0) {
            System.out.println(fio + "не брал книги ");
        } else {
            System.out.println(fio + "взял книги: ");
            for (BooK book : books) {
                System.out.println(book.getName() + "(" + book.getAvtor() + book.getYear() + "), ");
            }
        }
    }

    String getInforead(){
        return "ФИО читателя " + fio +", № читательского билета:  " + number +
                ", факультет: " + faculty + ", дата выдачи: " + date+ ", номер телефона: " + phoneNumber +
                ", количество книг:  " + kolvo;
    }

    public void returnBook(String fio, int kolvo){
        if (kolvo==0){
            System.out.println( fio + "не брал книги ");
        }
        else {
            System.out.println(fio + "вернул: " + kolvo + " книги.");
        }
    }
    public void returnBook(String fio, String ... names){
        if (kolvo==0){
            System.out.println( fio + "не брал книги ");
        }
        else {
            System.out.println(fio + "вернул книги: ");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
    public void returnBook(BooK... books){
        if (kolvo==0){
            System.out.println( fio + "не брал книги ");
        }
        else {
            System.out.println(fio + "вернул книги: ");
            for (BooK book : books) {
                System.out.println(book.getName() + "(" + book.getAvtor() + book.getYear() + "), ");
            }
        }
    }


}
