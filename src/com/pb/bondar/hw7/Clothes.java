package com.pb.bondar.hw7;

public abstract class Clothes {
    private Size size;
    private float price;
    private String color;
    private String nameClothes;

    public Clothes(){}

    public Clothes(String nameClothes,Size size, float price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.nameClothes = nameClothes;
    }


        public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameClothes() {
        return nameClothes;
    }

    public void setNameClothes(String nameClothes) {
        this.nameClothes = nameClothes;
    }
}
