package com.pb.bondar.hw6;

public class Animal {
    private String name;
    private String location;
    private String food;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public void makeNoise(){
        System.out.println(name + " Шумит");
    }
    public void eat(){
        //System.out.println(name + " Кушает...");
        System.out.println(name + " Жует");
    }
    public void sleep(){
        System.out.println(name + " Ложиться спать...");
        System.out.println(name + " Спит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
