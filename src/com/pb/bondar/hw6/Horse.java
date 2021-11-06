package com.pb.bondar.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String suit;
    private String mane;
    private int speed;

    public Horse(String suit,String mane,int speed){
        this.suit= suit;
        this.mane = mane;
        this.speed = speed;
    }

    public Horse(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " Ржет: игого - игого...");
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
        Horse horse = (Horse) o;
        return speed == horse.speed && Objects.equals(suit, horse.suit) && Objects.equals(mane, horse.mane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, mane, speed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "suit='" + suit + '\'' +
                ", mane='" + mane + '\'' +
                ", speed=" + speed +
                '}';
    }
}
