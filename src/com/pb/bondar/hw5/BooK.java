package com.pb.bondar.hw5;

public class BooK {
    private String name;
    private String avtor;
    private int year;

    public BooK(){

    }

    public BooK(String name,String avtor,int year){
        this.name = name;
        this.avtor = avtor;
        this.year = year;
    }

    public String getName(){return name;}
    public String getAvtor(){return avtor;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String getInfobook(){
        return "Название: " + name + "("+", Автор: " + avtor +
                ", год редакции: " + year + ")";
    }

}
