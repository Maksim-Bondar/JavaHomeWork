package com.pb.bondar.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String wool;

    public Cat(String wool) {
        this.wool = wool;
    }
    public Cat(){

    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " Мяукает: мяу - мяу...");
        System.out.println(getName() + " Шумит");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " Кушает...");
        System.out.println(getName() + " Жует "+ getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(wool, cat.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "wool='" + wool + '\'' +
                '}';
    }
}
