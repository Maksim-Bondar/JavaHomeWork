package com.pb.bondar.hw5;

import java.io.IOException;

public class Library {
    public static void main(String[] args) {

        BooK book1 = new BooK("Приключения Томса", "Маслов А.Н.", 1989);
        BooK book2 = new BooK("Толковый словарь", "Никитин Л.Н.", 1995);
        BooK book3 = new BooK("Энциклопедия животных", "Шевчук А.Р.", 1999);
        System.out.println(book1.getInfobook());
        System.out.println(book2.getInfobook());
        System.out.println(book3.getInfobook());

        Reader reader1 = new Reader("Петров В.В.","23","Кибернетика","21.10.2021",
                "0992000000",3);
        Reader reader2 = new Reader("Иванов М.В.","24","Менеджмент","25.10.2021",
                "0992000000",3);
        Reader reader3 = new Reader("Сидоров К.А.","25","Статистика","30.10.2021",
                "0992000000",3);
        System.out.println(reader1.getInforead());
        System.out.println(reader2.getInforead());
        System.out.println(reader3.getInforead());

        reader1.takeBook(reader1.fio,reader1.kolvo);
        reader2.takeBook(reader2.fio, book1.getName(), book2.getName(), book3.getName());
        reader3.takeBook(new BooK(book1.getName(), book1.getAvtor(), book1.getYear()),new BooK(book2.getName(), book2.getAvtor(), book2.getYear()),new BooK(book3.getName(), book3.getAvtor(), book3.getYear()));

        reader1.returnBook(reader1.fio,reader1.kolvo);
        reader2.returnBook(reader2.fio, book1.getName(), book2.getName(), book3.getName());
        reader3.returnBook(new BooK(book1.getName(), book1.getAvtor(), book1.getYear()),new BooK(book2.getName(), book2.getAvtor(), book2.getYear()),new BooK(book3.getName(), book3.getAvtor(), book3.getYear()));


    }
}
