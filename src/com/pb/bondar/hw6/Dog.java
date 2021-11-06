package com.pb.bondar.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;
    private String color;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }
    public Dog(){

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " Лает: гав-гав...");
        //System.out.println(getName() + " Шумит");
        super.makeNoise();
    }
    @Override
    public void eat(){
        System.out.println(getName() + " Кушает...");
        System.out.println(getName() + " Грызет "+ getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color);
    }

    @Override
    public String toString() {
        return "Dog: [" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ']';
    }
}
