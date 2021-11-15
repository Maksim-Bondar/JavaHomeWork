package com.pb.bondar.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(String nameClothes, Size size, float price, String color) {
        super(nameClothes, size, price, color);
    }

    @Override
    public void dressWomen(){
        System.out.println("Женщина одевает: "+getNameClothes()+" Размер: "+getSize()+" Цена: "+getPrice()+" Цвет: "+getColor());
    };
//    @Override
//    public void dressWomen(String nameClothes,String size,float price, String color){
//        System.out.println("Женщина одевает: "+nameClothes+size+price+color);
//    }
}
