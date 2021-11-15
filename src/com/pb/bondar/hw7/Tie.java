package com.pb.bondar.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(String nameClothes, Size size, float price, String color) {
        super(nameClothes, size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Мужчина одевает: "+getNameClothes()+" Размер: "+getSize()+" Цена: "+getPrice()+" Цвет: "+getColor());
    };
//    @Override
//    public void dressMan(String nameClothes,String size,float price, String color){
//        System.out.println("Мужчина одевает: "+nameClothes+size+price+color);
//    }
}
