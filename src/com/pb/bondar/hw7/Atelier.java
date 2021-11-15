package com.pb.bondar.hw7;

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("Футболка",Size.XL,20,"Black");
        Pants pants = new Pants("Штаны",Size.XXS,30,"With");
        Skirt skirt = new Skirt("Юбка",Size.M,40,"Green");
        Tie tie = new Tie("Галстук",Size.L,10,"blue");
        Clothes[] clothes = new Clothes[]{tshirt,pants,skirt,tie};
        dressMan(clothes);
        dressWomen(clothes);

    }

    static void dressMan(Clothes[] clothes) {
        System.out.println("Одеваем мужчину:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
                System.out.println("EURO размер: "+clothe.getSize().getEuroSize());
                System.out.println("Стандарт размера: "+clothe.getSize().getDiscription());
                System.out.println("-----------------------------------------");
            }
        }
    }
    static void dressWomen(Clothes[] clothes){
        System.out.println("Одеваем женщину:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
                System.out.println("EURO размер: "+clothe.getSize().getEuroSize());
                System.out.println("Стандарт размера: "+clothe.getSize().getDiscription());
                System.out.println("-----------------------------------------");
            }
        }

    }
}
